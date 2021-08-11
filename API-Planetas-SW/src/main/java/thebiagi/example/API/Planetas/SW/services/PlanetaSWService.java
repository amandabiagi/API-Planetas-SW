package thebiagi.example.API.Planetas.SW.services;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import reactor.core.publisher.Mono;
import thebiagi.example.API.Planetas.SW.api.ApiStarWars;
import thebiagi.example.API.Planetas.SW.models.PlanetaResponse;
import thebiagi.example.API.Planetas.SW.models.PlanetaSW;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class PlanetaSWService {

    private final ApiStarWars apiStarWars;

    public PlanetaSWService(ApiStarWars apiStarWars) {
        this.apiStarWars = apiStarWars;
    }

    public Flux<PlanetaResponse> getPlatenas(){
        List<PlanetaResponse> listaPlanetas = new ArrayList<>();
        Integer nPagina = 0;
        PlanetaResponse planetaResponse;
        Flux<PlanetaResponse> fluxPlanetas;

        do{
            nPagina++;
            planetaResponse = apiStarWars.getTodosPlanetas(nPagina);
            listaPlanetas.add(planetaResponse);

        }while(!planetaResponse.getNext().equals("null"));

        fluxPlanetas = Flux.fromIterable(listaPlanetas);
        return fluxPlanetas;
    }
}
