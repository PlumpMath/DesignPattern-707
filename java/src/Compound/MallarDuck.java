package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class MallarDuck implements Quackable{
    private Obserable observable;

    MallarDuck() {
        this.observable = new Obserable(this);

    }

    @Override
    public String toString() {
       return "MallarDuck";
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyOberservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyOberservers() {
        this.observable.notifyOberservers();
    }
}
