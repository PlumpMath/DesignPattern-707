package State;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class HasQuarterState implements State{

    private GumballMachine gm;

    public HasQuarterState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarer() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarer() {
        System.out.println("You ejected your quarter");
        gm.setNoQuarterState();
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the crank...");
        gm.setSoldState();

    }

    @Override
    public void dispense() {
        System.out.println("Turn the crank first");
    }
}
