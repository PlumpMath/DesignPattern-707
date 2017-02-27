package Compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kami.wm on 21/02/2017.
 *
 */
public class Obserable implements QuackObeserable{
    private ArrayList<Observer> observers = new ArrayList<>();
    private QuackObeserable duck;

    Obserable(QuackObeserable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyOberservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
