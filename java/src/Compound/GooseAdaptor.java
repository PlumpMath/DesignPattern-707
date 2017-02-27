package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 * 适配器模式
 */
public class GooseAdaptor implements Quackable{

    private Goose goose;

    GooseAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyOberservers() {

    }
}
