package Command;

/**
 * Created by ekansrm on 11/14/16.
 *
 */
public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(8);

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);

        System.out.println(remoteControl);
    }
}
