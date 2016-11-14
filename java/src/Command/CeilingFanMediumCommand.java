package Command;

/**
 * Created by ekansrm on 11/14/16.
 *
 */
public class CeilingFanMediumCommand implements Command{
    private CeillingFan ceillingFan;
    private int preSpeed;

    public CeilingFanMediumCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        preSpeed = ceillingFan.getCurrentSpeed();
        ceillingFan.setMedium();
        System.out.printf("%s Ceiling Fan set to %d\n", ceillingFan.getLocation(), ceillingFan.getCurrentSpeed());
    }

    @Override
    public void undo() {
        ceillingFan.setSpeed(preSpeed);
        System.out.printf("%s Ceiling Fan set to %d\n", ceillingFan.getLocation(), ceillingFan.getCurrentSpeed());
    }
}

