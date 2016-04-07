package sk.eastcode.weather;

import org.junit.Assert;
import org.junit.Test;


public class WeatherControllerTest {
    @Test
    public void testWeather () {
        WeatherController c = new WeatherController();
        String weather = c.getWeather();
        Assert.assertEquals("cold", weather);
    }
}
