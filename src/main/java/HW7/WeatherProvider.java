package HW7;

import HW7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException;

    void getWeatherIn5Days() throws IOException;
}
