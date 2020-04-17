package br.com.unifacef.ecommerce.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// A classe é um documento do MongoDB 
@Document(collection="produto")
public class Produto {

	@Id
	private String id;
	private String nome;
	private String tipo;
	private Integer quantidade;
	private Float valor;
	
	public Produto() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", tipo=" + tipo + ", quantidade=" + quantidade + ", valor="
				+ valor + "]";
	}
	
}
