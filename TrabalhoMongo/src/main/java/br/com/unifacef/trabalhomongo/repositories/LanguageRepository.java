package br.com.unifacef.trabalhomongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.unifacef.trabalhomongo.entities.Language;

public interface LanguageRepository extends MongoRepository<Language, String> {

}
