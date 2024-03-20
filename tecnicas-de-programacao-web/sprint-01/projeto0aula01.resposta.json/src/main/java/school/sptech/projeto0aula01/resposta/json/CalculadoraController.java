package school.sptech.projeto0aula01.resposta.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculos")
public class CalculadoraController {

    // singleton - nasce e nao morre - atributo de classe (não é variável global)
    private int contador;


    // PathVariable serve para instanciar a variavel
    @GetMapping("/somar/{n1}/{n2}")
    public Integer somar(@PathVariable int n1,
                         @PathVariable int n2){
        return n1 + n2;
    }

    @GetMapping("/contador")
    public int contador(){
        return ++contador;
    }

    @GetMapping("/contador2")
    public int contador2(){
        return ++contador;
    }
}
