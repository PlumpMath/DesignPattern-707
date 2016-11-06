package State;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class NoQuarterState implements State {

    private GumballMachine gm;

    public NoQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarer() {
        System.out.println("You inserted a quarter");
        gm.setHasQuarterState();
    }

    @Override
    public void ejectQuarer() {
        System.out.println("Sorry, you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, you haven't inserted a quarter");

    }

    @Override
    public void dispense() {
        System.out.println("Sorry, you haven't inserted a quarter");
    }
}
