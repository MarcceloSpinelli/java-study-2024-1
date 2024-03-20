package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Produto>> listar(){
        if (produtos.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(produtos);
    }

    @PostMapping
    public ResponseEntity<Produto> cadastrar(@RequestBody Produto novoProduto) {
        produtos.add(novoProduto);
        return ResponseEntity.status(201).body(novoProduto);
    }

    @PutMapping("/{indice}")
    public Produto atualizar(@PathVariable int indice,
                             @RequestBody Produto produtoAtualizado){
        if (indice >= 0 && indice < produtos.size()) {
            produtos.set(indice, produtoAtualizado);
            return produtos.get(indice);
        }
        return null;
    }

    @GetMapping("/{indice}")
    public Produto buscarPorIndice(@PathVariable int indice){
        if(indice >= 0 && indice < produtos.size()){
            return produtos.get(indice);
        }
        return null;
    }

    @GetMapping("/busca-por-nome")
    public ResponseEntity<List<Produto>> buscarPorNome(@RequestParam String nome) {
        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez.getNome().contains(nome)) {
                produtosEncontrados.add(produtoDaVez);
            }
        }

        if (produtosEncontrados.isEmpty()) {
            return ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).body(produtosEncontrados);
    }

    @GetMapping("/estoque/{indiceEstoque}")
    public ResponseEntity<List<Produto>> buscarPorEstoque(@PathVariable int indiceEstoque){
        List<Produto> produtosFiltrados = new ArrayList<>();

        for (Produto produtoDaVez:produtos) {
            if (produtoDaVez.getQtdEstoque() >= indiceEstoque) {
                produtosFiltrados.add(produtoDaVez);
            }
        }
        if (produtosFiltrados.isEmpty()){
            return  ResponseEntity.status(204).build();
        }

        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/{indice}")
    public ResponseEntity<Void> excluir(@PathVariable int indice){
        if (indice >= 0 && indice < produtos.size()){
            produtos.remove(indice);
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }


}