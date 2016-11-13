package Command;

/**
 * Created by ekansrm on 11/13/16.
 * 开灯命令
 */
public class LightOffCommand implements Command{

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();

    }

    @Override
    public void undo() {
        light.on();

    }
}

