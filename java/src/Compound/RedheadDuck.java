package Compound;


/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class RedheadDuck implements Quackable{

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberservers() {

    }
}
