package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.PersonneRepository;
import com.example.demo.model.Personne;

@Controller
public class ThymeleafController {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping("/thymeleaf")
	public String showView(Model model) {
		
		model.addAttribute("message", "Hello World !!");
		Personne p1 =(Personne)personneRepository.findById((long)2).orElse(null);
		model.addAttribute("personne", p1);
		model.addAttribute("personnes", personneRepository.findAll());
		return "thymeleaf/view";
	}

}
