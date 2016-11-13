package Command;

/**
 * Created by ekansrm on 11/13/16.
 * 遥控器
 */

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command preCommand;
    private int slotNum;

    public RemoteControl(int slotNum) {
        this.slotNum = slotNum;
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];

        Command noCommand = new NoCommand();
        for (int i = 0; i < slotNum; i += 1) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        preCommand = noCommand;

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        preCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        preCommand = offCommands[slot];
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i += 1) {
            stringBuffer.append("[slot ").append(i).append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("\t\t\t\t")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuffer.toString();

    }
}

