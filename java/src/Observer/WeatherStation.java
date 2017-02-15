package Observer;
import java.util.Observable;

/**
 * Created by kami.wm on 07/02/2017.
 *
 */
class WeatherStation extends Observable{
    private double temperature;
    private double humidity;
    private double pressure;
    private String name;

    WeatherStation(String name) {
        this.temperature = 0.0;
        this.humidity = 0.0;
        this.pressure = 0.0;
        this.name = name;
    }

    void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public String getName() {
        return name;
    }
}
