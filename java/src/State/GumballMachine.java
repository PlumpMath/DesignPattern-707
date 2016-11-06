package State;

/**
 * Created by ekansrm on 11/6/16.
 *
 */
public class GumballMachine {
    private SoldState soldState;
    private SoldOutState soldOutState;
    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;

    private State state;

    private int candyNum;

    public GumballMachine(int count) {
        this.candyNum = count;

        this.soldState = new SoldState(this);
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);

        if (this.candyNum == 0) {
            this.setSoldOutState();
        } else {
            this.setNoQuarterState();
        }

    }

    public void insertQuarer() {
        state.insertQuarer();
    }
    public void ejectQuarer() {
        state.ejectQuarer();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }
    public void dispense() {
       System.out.println("A gumball coming out ...");
    }

    void setSoldState() {
        this.state = this.soldState;
    }

    void setSoldOutState() {
        this.state = this.soldOutState;
    }

    void setNoQuarterState() {
        this.state = this.noQuarterState;
    }

    void setHasQuarterState() {
        this.state = this.hasQuarterState;
    }

    int getCandyNum() {
        return candyNum;
    }

    void setCandyNum(int candyNum) {
        this.candyNum = candyNum;
    }


    public static void main(String[] args) {
        GumballMachine gm = new GumballMachine(3);
        gm.insertQuarer();
        gm.turnCrank();

        gm.insertQuarer();
        gm.ejectQuarer();

        gm.insertQuarer();
        gm.turnCrank();

        gm.insertQuarer();
        gm.turnCrank();

        gm.insertQuarer();
        gm.turnCrank();
    }
}
