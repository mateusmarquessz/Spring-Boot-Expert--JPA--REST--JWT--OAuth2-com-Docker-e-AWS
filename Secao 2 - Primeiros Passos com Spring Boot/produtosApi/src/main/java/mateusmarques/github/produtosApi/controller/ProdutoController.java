package mateusmarques.github.produtosApi.controller;

import mateusmarques.github.produtosApi.model.entity.Produto;
import mateusmarques.github.produtosApi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController // Marca a Classe para ser um controlador REST
@RequestMapping("produtos") // Fala a url base de controller
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping //salva dados
    public Produto salvarProduto(@RequestBody Produto produto) { //ResquesBody para salvar os dados da requisicao json
        System.out.println("Produto recebido " + produto);
        var id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto; //Retorna o Json para a requisicao
    }

    @GetMapping("/{id}") // Pega os dados
    public Produto obterProdutoId(@PathVariable("id") String id) { // Serve para obter o dado via URl
        return produtoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletaProdutoId(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
    produto.setId(id);
    produtoRepository.save(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos(@RequestParam("nome") String nome) {
        return produtoRepository.findByNome(nome);
    }
}
