package Compound;

/**
 * Created by kami.wm on 21/02/2017.
 * 观察者模式
 */
public interface QuackObeserable {
    public void registerObserver(Observer observer);
    public void notifyOberservers();
}
