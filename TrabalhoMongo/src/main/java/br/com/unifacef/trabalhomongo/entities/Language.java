package br.com.unifacef.trabalhomongo.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="language")
public class Language {
	
	@Id
	private String language_id;
	private String name;
	private Date last_update;
	
	public Language() {
		
	}

	public String getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}
	
	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", name=" + name + ", last_update=" + last_update + "]";
	}

}