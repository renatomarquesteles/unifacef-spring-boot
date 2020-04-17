package br.com.unifacef.esaude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.esaude.entities.Virus;

public interface VirusRepository extends JpaRepository<Virus, Long> {
	
	
}
