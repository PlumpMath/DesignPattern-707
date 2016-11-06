package State;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class SoldState implements State {

    private GumballMachine gm;

    public SoldState(GumballMachine gm) {
        this.gm = gm;
    }

    @Override
    public void insertQuarer() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarer() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, you already turned the crank");

    }

    @Override
    public void dispense() {
        int candyNum = gm.getCandyNum();
        if (candyNum > 0) {
            gm.setCandyNum(candyNum-1);
            gm.dispense();
            gm.setNoQuarterState();
        } else {
            System.out.println("Oops, out of gumballs!");
            gm.setSoldOutState();
        }

    }
}
