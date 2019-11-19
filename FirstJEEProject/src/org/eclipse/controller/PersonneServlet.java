package org.eclipse.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;

/**
 * Servlet implementation class PersonneServlet
 */
//@WebServlet("/AjoutPersonne")
public class PersonneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PersonneServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutPersonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");

		
		
		boolean test = true;
		boolean verifNom=true;
		boolean verifPrenom=true;;
		try {
			verifChaine(nom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			request.setAttribute("nomIncorrect", e.getMessage());
			test=false;
		}
		try {
			verifChaine(prenom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			request.setAttribute("prenomIncorrect", e.getMessage());
			test=false;
		}
//		if (!verifNom)
//		request.setAttribute("nomIncorrect", "format incorrect");
//		if (!verifPrenom)
//		request.setAttribute("prenomIncorrect","format incorrect");
//		if (!verifNom || !verifPrenom){
//			request.setAttribute("nomSaisi", nom);
//			request.setAttribute("prenomSaisi",prenom);
//			this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutPersonne.jsp").forward(request, response);
//		}
//		else {
//			Personne p = new Personne(nom,prenom);
//			PersonneDaoImpl daop = new PersonneDaoImpl();
//			request.setAttribute("personne",p);
//			this.getServletContext().getRequestDispatcher("/WEB-INF/Confirmation.jsp").forward(request, response);
//			daop.save(p);
//		}
		if (test)
		{
			Personne p = new Personne(nom,prenom);
			PersonneDaoImpl daop = new PersonneDaoImpl();
			request.setAttribute("personne",p);
			daop.save(p);
			this.getServletContext().getRequestDispatcher("/WEB-INF/Confirmation.jsp").forward(request, response);
			
		}
		else {
			request.setAttribute("nomSaisi", nom );
			request.setAttribute("prenomSaisi",prenom);
			this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutPersonne.jsp").forward(request, response);
			
			}

	}

	public boolean verifChaine(String s) throws Exception {
		if (s == null || s.length() < 2)
			throw new Exception("La chaine doit comporter au moins deux caractères");
		char c = s.charAt(0);
		if (!(c >= 'A' && c <= 'Z'))
			throw new Exception("Le 1er caractère doit être une majuscule");
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z'))
				throw new Exception("La chaine ne peut contenir que des lettres");
		}
		return true;
	}

}
