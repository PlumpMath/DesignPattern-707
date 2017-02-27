package Compound;


/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberservers() {

    }
}
