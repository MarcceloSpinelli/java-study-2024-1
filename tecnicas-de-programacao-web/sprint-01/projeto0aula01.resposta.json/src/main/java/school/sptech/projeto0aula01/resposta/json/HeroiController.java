package school.sptech.projeto0aula01.resposta.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/heroi")
public class HeroiController {

    // Serializer transforma de objeto para json
    // Deserializer transforma de json para objeto

    private List<Heroi> herois = new ArrayList<>();




    @GetMapping("/favorito")
    public Heroi favorito(){
        Heroi heroiFavorito = new Heroi("Corinthians", "Cassio", 99999, 114, true);

        herois.add(heroiFavorito);

        return heroiFavorito;
    }

    @GetMapping("/herois")
    public List<Heroi> herois(){
        return herois;
    }

}
