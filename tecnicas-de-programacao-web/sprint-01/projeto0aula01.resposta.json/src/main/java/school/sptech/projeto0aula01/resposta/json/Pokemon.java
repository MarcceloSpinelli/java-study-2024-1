package school.sptech.projeto0aula01.resposta.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class Pokemon {

    private List<String> pokemon = new ArrayList<>();

    @GetMapping("/contagem")
    public String contagem() {
        return "Total de pokemon cadastrados: " + pokemon.size();
    }

    @GetMapping("/cadastrar/{novoPokemon}")
    public String cadastrarPokemon(@PathVariable String novoPokemon) {
        pokemon.add(novoPokemon);
        return "Pokemon cadastrado";
    }

    @GetMapping("/recuperar/{indice}")
    public String recuperarPokemon(@PathVariable int indice) {
        if (indice >= 0 && indice < pokemon.size()) {
            return "Pokemon encontrado: " + pokemon.get(indice);
        } else {
            return "Pokemon não encontrado";
        }
    }

    @GetMapping("/excluir/{indice}")
    public String excluirPokemon(@PathVariable int indice) {
        if (indice >= 0 && indice < pokemon.size()) {
            pokemon.remove(indice);
            return "Excluído";
        } else {
            return "Pokemon não encontrado";
        }
    }

    @GetMapping("/atualizar/{indice}/{novoNome}")
    public String atualizarPokemon(@PathVariable int indice, @PathVariable String novoNome) {
        if (indice >= 0 && indice < pokemon.size()) {
            pokemon.set(indice, novoNome);
            return "Pokemon Atualizado";
        } else {
            return "Pokemon não encontrado";
        }
    }
}
