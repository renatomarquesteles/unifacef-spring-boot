package br.com.unifacef.esaude.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="virus") // a classe Virus é mapeado para a tabela virus
public class Virus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5717246901784916729L;
	 // garante que o objeto origem e fim são os mesmos

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="letalidade")
	private float letalidade;
	
	@Column(name="origem") // mapeamento
	private String origem;
	
	public Virus() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getLetalidade() {
		return letalidade;
	}

	public void setLetalidade(float letalidade) {
		this.letalidade = letalidade;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Virus [id=" + id + ", nome=" + nome + ", letalidade=" + letalidade + ", origem=" + origem + "]";
	}
	
	
}
