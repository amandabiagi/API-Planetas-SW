package thebiagi.example.API.Planetas.SW.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@PropertySource("classpath:application.properties")
public class SWConfiguration {

    @Value("${sw.base-url}")
    public String urlBase;

    @Value("${sw.uri.planets}")
    public String uriPlanet;

}
