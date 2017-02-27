package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallarDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
