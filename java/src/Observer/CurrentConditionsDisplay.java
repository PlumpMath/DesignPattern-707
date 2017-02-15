package Observer;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by kami.wm on 07/02/2017.
 *
 */
public class CurrentConditionsDisplay implements Displayment, Observer{
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private String stationName;
//    private Observable observable;

    void addWeatherStation(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前读数:");
        System.out.println("城市: " + stationName);
        System.out.println("湿度: " + humidity.toString());
        System.out.println("气压: " + pressure.toString());
        System.out.println("气温: " + temperature.toString());

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherStation) {
            WeatherStation weatherStation = (WeatherStation)o;
            temperature = weatherStation.getTemperature();
            humidity = weatherStation.getHumidity();
            pressure = weatherStation.getPressure();
            stationName = weatherStation.getName();
        }
        display();

    }
}
