package Compound;

/**
 * Created by kami.wm on 22/02/2017.
 *
 */
public class Quacklogist implements Observer{
    @Override
    public void update(QuackObeserable duck) {
        System.out.println("Quacklogist: " + duck.toString() + " just quacked!");
    }
}
