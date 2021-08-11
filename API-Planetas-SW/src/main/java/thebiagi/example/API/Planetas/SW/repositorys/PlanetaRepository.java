package thebiagi.example.API.Planetas.SW.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thebiagi.example.API.Planetas.SW.models.Planeta;
import reactor.core.publisher.Mono;

@Repository
public interface PlanetaRepository extends JpaRepository<Planeta, Integer> {
    Mono<Planeta> findByNome(String nome);

}
