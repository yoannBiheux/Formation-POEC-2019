package org.eclipse.FirstSpringMvc.controller;

import java.util.ArrayList;

import org.eclipse.FirstSpringMvc.dao.PersonneRepository;
import org.eclipse.FirstSpringMvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonneController 
{
	@Autowired
	private PersonneRepository personneRepository;
	
	@GetMapping(value="/addPersonne")
	public String addPersonne() {
	return "addPersonne";
	}

	@PostMapping(value = "/addPersonne")
	public ModelAndView addPersonne(@RequestParam(value = "nom") String nom, @RequestParam(value = "prenom") String prenom)
	{
		Personne p = new Personne();
		p.setNom(nom);
		p.setPrenom(prenom);
		personneRepository.save(p);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("confirm");
		mView.addObject("nom",nom);
		mView.addObject("prenom",prenom);
		return mView;
	}
	
	@RequestMapping(value="/showAll")
	public ModelAndView showAll() {
		ArrayList <Personne> al =(ArrayList<Personne>) personneRepository.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("tab", al);
		return mv;
	}
	
	

}
