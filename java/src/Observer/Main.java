package Observer;

/**
 * Created by kami.wm on 07/02/2017.
 */
public class Main {
    public static void main(String[] arg) {
        WeatherStation hz = new WeatherStation("杭州");
        WeatherStation gz = new WeatherStation("广州");

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        currentConditionsDisplay.addWeatherStation(hz);
        currentConditionsDisplay.addWeatherStation(gz);
        hz.setMeasurements(1.2, 3.4, 5.6);
        hz.setMeasurements(4.2, 7.4, 9.6);
        gz.setMeasurements(30, 40, 32);

    }
}
