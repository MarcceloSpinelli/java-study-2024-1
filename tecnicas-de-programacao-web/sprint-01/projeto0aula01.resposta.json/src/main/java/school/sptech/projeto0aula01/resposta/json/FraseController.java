package school.sptech.projeto0aula01.resposta.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FraseController {


    // NAVEGADOR SÓ FAZ GET
    // NAVEGADOR NÃO FAZ POST, PUT OU DELETE
    // http://localhost:8080/frase
    @GetMapping
    public String fraseBacana() {
        return "Frase super alto astral criativa (nao existe)";
    }


    // http://localhost:8080/frase/personalizada/meu nome
    @GetMapping("/personalizada/{name}")
    public String personalizada(@PathVariable String name){
        return "olá " + name;
    }

    @GetMapping("/personalizada2/{name}/{sobrenome}")
    public String personalizada2(
            @PathVariable String name,
            @PathVariable String sobrenome){
        return "olá " + name + "" + sobrenome;
    }
}
