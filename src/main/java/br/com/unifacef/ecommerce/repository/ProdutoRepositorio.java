package br.com.unifacef.ecommerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.unifacef.ecommerce.entities.Produto;

// Interface para acesso aos métodos de CRUD do MongoDB
public interface ProdutoRepositorio extends MongoRepository<Produto, String> {

}
