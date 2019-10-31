package org.eclipse.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.model.Personne;

/**
 * Servlet implementation class TestServlet
 */
//@WebServlet("/mapage")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.getWriter().print("Hello world!!!!! nom d'une pipe");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		
//		String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		out.print("Hello " + prenom +" "+ nom);
		
//		Personne perso = new Personne();
//		perso.setNom("Wick");
//		perso.setPrenom("John");
//		perso.setNum(100);
//		out = response.getWriter();
//		out.print(perso);

		
		Personne perso = new Personne();
		perso.setNom("Davoust");
		perso.setPrenom("Fabrice");
		perso.setNum(100);
		Personne perso2 = new Personne();
		perso2.setNom("Richard");
		perso2.setPrenom("Nathalie");
		perso2.setNum(200);
		Personne perso3 = new Personne();
		perso3.setNom("Cannone");
		perso3.setPrenom("Philippe");
		perso3.setNum(300);
		Personne perso4 = new Personne();
		perso4.setNom("Boukhari");
		perso4.setPrenom("Sofiane");
		perso4.setNum(400);
		ArrayList<Personne> personnes = new ArrayList();
		personnes.add(perso);
		personnes.add(perso2);
		personnes.add(perso3);
		personnes.add(perso4);
		request.setAttribute("persos",personnes);
		
		
		ArrayList<String> sport = new ArrayList<String>();
		sport.add( "football" );
		sport.add( "tennis" );
		sport.add( "rugby");
		sport.add( "basketball" );
		request.setAttribute( "sport" , sport );
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/test.jsp").forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
