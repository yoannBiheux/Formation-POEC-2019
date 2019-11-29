package org.eclipse.FirstSpringMvc.controller;

import java.util.List;

import javax.management.loading.PrivateClassLoader;

import org.eclipse.FirstSpringMvc.dao.AdresseRepository;
import org.eclipse.FirstSpringMvc.dao.PersonneRepository;
import org.eclipse.FirstSpringMvc.model.Adresse;
import org.eclipse.FirstSpringMvc.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonneRestController {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@Autowired
	private AdresseRepository adresseRepository;
	
	@GetMapping("/personnes")
	public List<Personne> getPersonnes() {
	return personneRepository.findAll();
	}
	@GetMapping("/personnes/{id}")
	public Personne getPersonne(@PathVariable("id") long id) {
	return personneRepository.findById(id).orElse(null);
	}
//	@PostMapping("/personnes")
//	public Personne addPersonne(@RequestBody Personne personne) {
//	System.out.println(personne);
//	return personneRepository.save(personne);
//	}
	@PostMapping("/personnes")
	public Personne addPersonne(@RequestBody Personne personne) {

		return personneRepository.saveAndFlush(personne);
	}
	
	
	
	@DeleteMapping("/deletepersonnes/{id}")
	public void deletePersonne(@PathVariable("id") long id)
	{
		Personne p1 =(Personne)personneRepository.findById(id).orElse(null);
		if(p1!=null)
			personneRepository.delete(p1);
	}
	
	@PutMapping("/putpersonnes/{id}")
	public boolean updatePersonne(@PathVariable("id") long id, @RequestBody Personne personne)
	{
		Personne p1 =(Personne)personneRepository.findById(id).orElse(null);
		System.out.println(p1);
		System.out.println(personne);
		if(p1!=null)
		{
			p1.setNom(personne.getNom());
			p1.setPrenom(personne.getPrenom());
			personneRepository.saveAndFlush(p1);
			return true;
		}
		else
			return false;
		
	
	
	}

}
