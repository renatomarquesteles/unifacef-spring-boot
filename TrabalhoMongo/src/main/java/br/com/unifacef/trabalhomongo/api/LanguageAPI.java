package br.com.unifacef.trabalhomongo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.trabalhomongo.entities.Language;
import br.com.unifacef.trabalhomongo.repositories.LanguageRepository;

@RestController
@RequestMapping("/language")
public class LanguageAPI {
	@Autowired
	private LanguageRepository injecao;
	
	@GetMapping
	public List<Language> consulta() {
		return injecao.findAll();
	}
	
	@PostMapping
	public Language cadastra(@RequestBody Language language) {
		Language novo = injecao.save(language);
		return novo;
	}
	
	@DeleteMapping("/{language_id}") //metodos
	public Language remove(@PathVariable String language_id) {
	 injecao.deleteById(language_id);
		return null;
		
	}
	@PutMapping //metodos
	public Language atualiza(@RequestBody Language language) {
		return injecao.save(language); 
		
	}
}
