package br.com.unifacef.trabalhopg.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language") 
public class Language implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3154421010888778616L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long language_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="last_update")
	private String last_update;

	public Language() {}
	
	
	public Long getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(Long language_id) {
		this.language_id = language_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_update() {
		return last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", name=" + name + ", last_update=" + last_update + "]";
	}

}	