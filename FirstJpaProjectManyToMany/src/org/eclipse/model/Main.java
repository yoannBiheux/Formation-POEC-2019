package org.eclipse.model;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstJpaProject");
		EntityManager em = emf.createEntityManager();
		

		//consultationNamedQuery(em);
		
		//detach(em);
		//oneToMany(em);
		//testAddAdresseSup(em);
		manyToMany(em);
		em.close();
		emf.close();
		
		

	}
	
	public static void insertion(EntityManager em, String prenom, String nom)
	{
		//INSERTION

		// instanciation de l’entite
		Personne p = new Personne();
		p.setPrenom(prenom);
		p.setNom(nom);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); // d´ebut transaction
		em.persist(p); // persister dans la base de donn´ees
		transaction.commit(); // valider transaction
		// fermer l’EntityManager et la factory

	}
	
	public static void suppression(EntityManager em)
	{
		Personne p = em.find(Personne.class, 4);
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		if (p == null) {
		System.out.println("Personne non trouvee");
		}
		else {
		// supprimer l’element
		em.remove(p);
		}
		// valider la transaction
		transaction.commit();

	}
	
	public static void update(EntityManager em)
	{
		// chercher l’´el´ement a modifier
		Personne p = em.find(Personne.class, 2); // on indique la classe et la valeur de la cl´e primaire
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		if (p == null) {
		System.out.println("Personne non trouvee");
		}
		else {
		p.setPrenom("Bob"); // faire une modification
		em.flush(); // enregistrer la modification
		}
		// valider la transaction
		transaction.commit();

	}
	
	public static void recherche(EntityManager em)
	{

		// instanciation de l’entite
		Personne p = new Personne();
		p.setPrenom("Yoann");
		p.setNom("Biheux");
		EntityTransaction transaction = em.getTransaction();
		transaction.begin(); // d´ebut transaction
		em.persist(p); // persister dans la base de donn´ees
		transaction.commit(); // valider transaction
		// fermer l’EntityManager et la factory

		
	
	}
	
	public static void consultation( EntityManager em)
	{
		// definir la requete
		String str = "select * from Personne";
		// executer la requete et preciser l’entite concernee
		Query query = em.createNativeQuery(str, org.eclipse.model.Personne.class);
		// recuperer le resultat
		List <Personne> personnes = (List <Personne> ) query.getResultList();
		for (Personne p : personnes) {
		System.out.println("nom = "+ p.getNom());
		}

		
	}
	
	public static void consultation2( EntityManager em)
	{

		Query query = em.createNativeQuery("select * from Personne where num = ?", org.eclipse.model.Personne.class);
		query.setParameter(1, 2);
		Personne p = (Personne) query.getSingleResult();
		System.out.println("nom = "+ p.getNom());

		

		
	}
	
	public static void consultationNamedQuery( EntityManager em)
	{

		Query query = em.createNamedQuery("findByNomPrenom");
		query.setParameter("nom", "Pineau");
		query.setParameter("prenom", "Carine");
		List <Personne> personnes = (List <Personne> ) query.getResultList();
		for (Personne p : personnes) 
		{
			System.out.println("nom = "+ p.getNom());
		}

	}
	
	public static void refresh( EntityManager em)
	{

		//on suppose que John Wick avec un num 10 existe dans la BD
		System.out.println("toto");
		Personne p = em.find(Personne.class, 10);
		p.setNom("Travolta");
		em.refresh(p);
		System.out.println("le nom est " + p.getNom());
		// imprime Wick

		// si on supprime em.refresh(p); Travolta sera		affiche
	}
	
	public static void detach( EntityManager em)
	{

		Personne p = em.find(Personne.class, 11);
		p.setNom("Travolta");
		em.detach(p); // p n’est plus gere par em
		em.getTransaction().begin();
		em.flush();
		em.getTransaction().commit();
		Personne p1 = em.find(Personne.class, 11);
		System.out.println("le nom est " + p1.getNom());
	}
	
	public static void ajoutPersonneAvecAdresse(EntityManager em)
	{
		Adresse a = new Adresse();
		a.setRue("Rebeval");
		a.setCodePostal("75019");
		a.setVille("Paris");
		Personne p = new Personne();
		//p.setAdresse(a);
		p.setNom("Biheux");
		p.setPrenom("Yoann");
		
		EntityTransaction t =em.getTransaction();
		t.begin();
		em.persist(p);
		t.commit();
		System.out.println("insertion reussie ");
	}
	public static void manyToOne(EntityManager em)
	{
		Adresse a = new Adresse();
		a.setRue("Rebeval");
		a.setCodePostal("75019");
		a.setVille("Paris");
		Personne p = new Personne();
		//p.setAdresse(a);
		p.setNom("Biheux");
		p.setPrenom("Yoann");
		Personne p2 = new Personne();
		//p2.setAdresse(a);
		p2.setNom("Davoust");
		p2.setPrenom("Fabrice");
		
		EntityTransaction t =em.getTransaction();
		t.begin();
		em.persist(p);
		em.persist(p2);
		t.commit();
		System.out.println("insertion reussie ");

	}
	
	public static void oneToMany(EntityManager em)
	{
		Adresse a = new Adresse();
		a.setRue("Rebeval");
		a.setCodePostal("75019");
		a.setVille("Paris");
		Adresse a2 = new Adresse();
		a2.setRue("Coulmiers");
		a2.setCodePostal("75014");
		a2.setVille("Paris");
		
		Personne p = new Personne();
		//p.setAdresse(a);
		p.setNom("Biheux");
		p.setPrenom("Yoann");
		p.addAdresse(a);
		p.addAdresse(a2);

		
		EntityTransaction t =em.getTransaction();
		t.begin();
		em.persist(p);

		t.commit();
		System.out.println("insertion reussie ");

	}
	
	public static void testAddAdresseSup(EntityManager em)
	{
		Personne p = em.find(Personne.class, 1);
		System.out.println(p);
		p.addAdresse(new Adresse("Faubourg Saint Honoré","75009","Paris"));
		
		EntityTransaction t =em.getTransaction();
		t.begin();
		em.persist(p);

		t.commit();
		System.out.println("ajout d'adresse reussie ");
	}
	
	
	public static void manyToMany(EntityManager em)
	{
		Adresse a = new Adresse();
		a.setRue("Rebeval");
		a.setCodePostal("75019");
		a.setVille("Paris");
		
		Personne p = new Personne();
		//p.setAdresse(a);
		p.setNom("Biheux");
		p.setPrenom("Yoann");
		p.addAdresse(a);
		
		Personne p2 = new Personne();
		//p.setAdresse(a);
		p2.setNom("Richard");
		p2.setPrenom("Nathalie");
		p2.addAdresse(a);
		
		Sport sp1 = new Sport("Tennis","individuel");
		Sport sp2 = new Sport("Basket-ball","collectif");
		Sport sp3 = new Sport("Football", "collectif");
		
		p.addSport(sp1);
		p.addSport(sp2);
		p2.addSport(sp2);
		p2.addSport(sp3);
		
		EntityTransaction t =em.getTransaction();
		t.begin();
		em.persist(p);
		em.persist(p2);

		t.commit();
		System.out.println("ajout d'adresse reussie ");
		
	}
}
