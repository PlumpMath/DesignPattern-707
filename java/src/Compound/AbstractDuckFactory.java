package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 * 抽象工厂
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallarDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();

}
