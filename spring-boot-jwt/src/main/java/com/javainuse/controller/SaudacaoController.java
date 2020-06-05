package com.javainuse.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class SaudacaoController {

	@RequestMapping({ "/saudacao" })
	public String hello() {
		return "Olá, Uni-FACEF!!!";
	}

}
