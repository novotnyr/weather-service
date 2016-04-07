package sk.eastcode.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class WeatherController {
    @RequestMapping
    public String getWeather() {
        "Cold";
    }

    public static void main(String[] args) {
        SpringApplication.run(WeatherController.class, args);
    }
}
