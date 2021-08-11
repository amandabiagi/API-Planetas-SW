package thebiagi.example.API.Planetas.SW.api;


import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import thebiagi.example.API.Planetas.SW.configurations.SWConfiguration;
import thebiagi.example.API.Planetas.SW.models.PlanetaResponse;
import thebiagi.example.API.Planetas.SW.models.PlanetaSW;

import java.util.List;

@Component
public class ApiStarWars {

   private final String uriPlanets ;
   private final WebClient webClient;

    ApiStarWars(SWConfiguration swConfiguration, WebClient webClient) {
        this.uriPlanets = swConfiguration.uriPlanet;
        this.webClient = webClient;
    }

    public Mono<PlanetaResponse> getTodosPlanetas(Integer nPagina){
        return webClient
                .method(HttpMethod.GET)
                .uri(uriPlanets, nPagina)
                .retrieve()
                .bodyToMono(PlanetaResponse.class);

    }



}
