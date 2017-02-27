package Compound;

/**
 * Created by kami.wm on 20/02/2017.
 * 装饰器模式
 *
 */
class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;

    QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        this.duck.quack();
        numberOfQuacks++;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.duck.registerObserver(observer);

    }

    @Override
    public void notifyOberservers() {
        this.duck.notifyOberservers();

    }
}
