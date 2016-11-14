package Command;

/**
 * Created by ekansrm on 11/14/16.
 *
 */
public class CeilingFanHighCommand implements Command{
    private CeillingFan ceillingFan;
    private int preSpeed;

    public CeilingFanHighCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceillingFan.getCurrentSpeed();
        ceillingFan.setHigh();
        System.out.printf("%s Ceiling Fan set to %d\n", ceillingFan.getLocation(), ceillingFan.getCurrentSpeed());
    }

    @Override
    public void undo() {
        ceillingFan.setSpeed(preSpeed);
        System.out.printf("%s Ceiling Fan set to %d\n", ceillingFan.getLocation(), ceillingFan.getCurrentSpeed());
    }
}
