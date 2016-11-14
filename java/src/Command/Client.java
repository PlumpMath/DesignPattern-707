package Command;

/**
 * Created by ekansrm on 11/14/16.
 *
 */
public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(8);

        Light livingRoomLight = new Light("Living Room");
        CeillingFan ceillingFan = new CeillingFan("Bed Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceillingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceillingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceillingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceillingFan);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        System.out.println("\n---- Push Slot Button ----");
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);

        System.out.println("\n---- Push Undo Button ----");
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
    }
}
