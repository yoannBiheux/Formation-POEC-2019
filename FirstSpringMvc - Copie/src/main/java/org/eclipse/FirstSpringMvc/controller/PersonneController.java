package org.eclipse.FirstSpringMvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.FirstSpringMvc.dao.PersonneRepository;
import org.eclipse.FirstSpringMvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/showAllByPage/{i}/{j}")
	public ModelAndView showAllByPage(@PathVariable int i,@PathVariable int j) {
		Page<Personne> personnes = personneRepository.findAll(PageRequest.of(i, j));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("tab", personnes.getContent());
		return mv;
	}
	
	@RequestMapping(value="/showAllSorted")
	public ModelAndView showAllSorted() {
		List<Personne> personnes = personneRepository.findAll(Sort.by("nom").descending());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("tab", personnes);
		return mv;
	}
	
	@RequestMapping(value="/showSome")
	public ModelAndView showSome(@RequestParam(value ="nom") String nom, @RequestParam(value = "prenom") String prenom) {
		ArrayList <Personne> al =(ArrayList<Personne>)personneRepository.findByNomAndPrenom(nom,prenom);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("tab", al);
		return mv;
	}


	
	

}
