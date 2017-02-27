package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 *
 */
public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallarDuck() {
        return new QuackCounter(new MallarDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
}
