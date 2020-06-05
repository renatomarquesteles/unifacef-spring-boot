package br.com.unifacef.trabalhopg.controllers;

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

import br.com.unifacef.trabalhopg.entities.Language;
import br.com.unifacef.trabalhopg.repositories.LanguageRepository;

@RestController
@RequestMapping("/api/languages") 
public class LanguageController {
		
	
		@Autowired
		private LanguageRepository injecao;
	
		@PostMapping
		public Language insere(@RequestBody Language language) { 
			return injecao.save(language);
		}

		@DeleteMapping("/{language_id}") //metodos
		public Language remove(@PathVariable Long language_id) {
		 injecao.deleteById(language_id);
			return null;
			
		}
		
		@GetMapping //metodos
		public List<Language> consulta() {
			return injecao.findAll(); 
			
			
		}
		@PutMapping //metodos
		public Language atualiza(@RequestBody Language language) {
			return injecao.save(language); 
			
		}
}	