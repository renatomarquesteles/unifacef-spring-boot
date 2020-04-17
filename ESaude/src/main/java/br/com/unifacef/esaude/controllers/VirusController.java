package br.com.unifacef.esaude.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.esaude.entities.Virus;
import br.com.unifacef.esaude.repositories.VirusRepository;

@RestController
@RequestMapping("/api/virus")
public class VirusController {
	
	// injeção de dependência
	@Autowired
	private VirusRepository injecao;
	
	public Virus insere(Virus virus) {
		return injecao.save(virus);
	}
	
	public void remove(Virus virus) {
		injecao.delete(virus);
	}
	
	public List<Virus> consulta() {
		return injecao.findAll();
	}
	
	public Virus atualiza(Virus virus) {
		return injecao.save(virus);
	}
}
