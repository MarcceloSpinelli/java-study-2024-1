package school.sptech.projetoaula01respostajson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/herois")
public class HeroiController {

    private List<Heroi> herois = new ArrayList<>();

    // http://localhost:8080/herois/favorito
    @GetMapping("/favorito")
    public Heroi favorito() {
        Heroi heroiFavorito = new Heroi("Homem Sereia", 6000, "Nada", 500, true);

        herois.add(heroiFavorito);

        return heroiFavorito;
    }

    // http://localhost:8080/herois
    @GetMapping
    public List<Heroi> herois() {
        return herois;
    }
}
