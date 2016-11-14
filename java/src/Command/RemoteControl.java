package Command;

import java.util.List;
import java.util.Stack;

/**
 * Created by ekansrm on 11/13/16.
 * 遥控器
 */

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Stack<Command> preCommands;
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
        preCommands = new Stack<Command>();

    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        preCommands.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        preCommands.push(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if (!preCommands.empty()) {
            preCommands.pop().undo();
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i += 1) {
            stringBuffer.append("[slot ").append(i).append("]")
                    .append(onCommands[i].getClass().getName())
                    .append("  ")
                    .append(offCommands[i].getClass().getName())
                    .append("\n");
        }
        return stringBuffer.toString();

    }
}

