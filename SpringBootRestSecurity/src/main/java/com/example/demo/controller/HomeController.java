package com.example.demo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "jsp/home";
	}
//	@GetMapping(value = "/hello")
//	public void sayHello() {
//		System.out.println("Hello World!");
//	}
//	@RequestMapping(value="/hello", method = RequestMethod.GET)
//	public void sayHello(@RequestParam(value = "nom", defaultValue = "Biheux") String nom)
//	{
//	System.out.println("hello " + nom);
//	}
	
//	@GetMapping(value = "/hello/{nom}")
//	public void sayHello(@PathVariable String nom) {
//	System.out.println("hello " + nom);
//	}
	
//	@GetMapping(value="/hello")
//	public String sayHello(Model model) {
//		model.addAttribute("nom", "James Bond");
//		return "hello";
//	}
	
	@GetMapping(value="/helloBlaBla")
	public ModelAndView sayHello(ModelAndView mv) {
	mv.setViewName("jsp/hello");
	mv.addObject("nom", "tutut");
	return mv;
	}


	
}
