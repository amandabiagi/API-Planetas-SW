package thebiagi.example.API.Planetas.SW.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import thebiagi.example.API.Planetas.SW.models.PlanetaResponse;
import thebiagi.example.API.Planetas.SW.services.PlanetaSWService;


@RestController
@RequestMapping("/sw")
public class PlanetaSWController {

    @Autowired
    PlanetaSWService planetaSWService;

    @GetMapping()
    public ResponseEntity<Flux<PlanetaResponse>> getPlanetasSw(){
        return ResponseEntity.ok(planetaSWService.getPlatenas());
    }

}
