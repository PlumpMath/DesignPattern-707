package Compound;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kami.wm on 27/02/2017.
 *
 */
public class Flock implements Quackable{
    private AbstractList<Quackable> quackers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyOberservers() {
    }

    public void add(Quackable duck) {
        quackers.add(duck);
    }

    @Override
    public void quack() {
        System.out.println("A Flock of ducks just quacked! ");
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.quack();
        }
    }
}
