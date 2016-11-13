package Command;

/**
 * Created by ekansrm on 11/13/16.
 * 开灯命令
 */
public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();

    }
}
