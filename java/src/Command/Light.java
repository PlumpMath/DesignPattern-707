package Command;

/**
 * Created by ekansrm on 11/13/16.
 * 灯对象
 */
public class Light {
    private String name;

    Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s light is on\n", name);
    }

    public void off() {
        System.out.printf("%s light is off\n", name);
    }
}
