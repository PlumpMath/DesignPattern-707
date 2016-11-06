package State;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class SoldOutState implements State {

    private GumballMachine gm;

    public SoldOutState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarer() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void ejectQuarer() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, out of gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, out of gumballs");
    }
}
