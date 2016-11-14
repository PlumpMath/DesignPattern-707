package Command;

/**
 * Created by ekansrm on 11/14/16.
 */
public class CeillingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int currentSpeed;

    public CeillingFan(String location_i) {
        this.location = location_i;
        currentSpeed = OFF;
    }


    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setHigh() {
        this.currentSpeed = HIGH;
    }

    public void setMedium() {
        this.currentSpeed = MEDIUM;
    }

    public void setLow() {
        this.currentSpeed = LOW;
    }

    public void setOff() {
        this.currentSpeed = OFF;
    }

    public void setSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public String getLocation() {
        return location;
    }

}
