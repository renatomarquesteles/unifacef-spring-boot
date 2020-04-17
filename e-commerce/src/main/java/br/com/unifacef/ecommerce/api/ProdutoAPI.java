package br.com.unifacef.ecommerce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.ecommerce.entities.Produto;
import br.com.unifacef.ecommerce.repository.ProdutoRepositorio;

// Classe que controla solicitação de API em REST
@RestController
// Mapeamento das solicitações para esta classe
@RequestMapping("/produto")
public class ProdutoAPI {
	
	// Injeção de dependência
	// Usar um objeto de uma interface sem ter que instanciá-lo
	@Autowired
	private ProdutoRepositorio injecao;
	
	// Consulta e retorna uma lista de produtos
	@GetMapping
	public List<Produto> consulta() {
		return injecao.findAll();
	}
	
	// Insere um produto
	@PostMapping
	public Produto cadastra(@RequestBody Produto produto) {
		Produto novo = injecao.save(produto);
		return novo;
	}
	
}
