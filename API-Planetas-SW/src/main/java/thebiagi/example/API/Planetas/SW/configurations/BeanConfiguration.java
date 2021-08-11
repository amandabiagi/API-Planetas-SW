package thebiagi.example.API.Planetas.SW.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanConfiguration {

   private final String urlBase;

    public BeanConfiguration(SWConfiguration swConfiguration) {
        this.urlBase = swConfiguration.urlBase;

    }

    @Bean
    public WebClient webClient(WebClient.Builder builder){
        return builder
                .baseUrl(urlBase)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
