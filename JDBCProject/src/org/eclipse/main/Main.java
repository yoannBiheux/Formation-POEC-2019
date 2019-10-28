package org.eclipse.main;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.LineListener;

import org.eclipse.dao.PersonneDaoImpl;
import org.eclipse.model.Personne;


public class Main {

	public static void main(String[] args) 
	{
//		String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//		String user = "root";
//		String password = "root";
//		Connection connexion = null;
		

				//connexion = MyConnection.getConnection();
				//Statement statement = connexion.createStatement();
				//String request = "SELECT * FROM personne;";
				
				
				
				
				
//				Statement statement2 = connexion.createStatement();
//				String request2 = "INSERT INTO Personne (nom,prenom)	VALUES ('bouckarie','sofiane');";
//				int nbr = statement2.executeUpdate(request2);
//				if (0!=nbr)
//					System.out.println("insertion reussie");
				
//				Statement statement3 = connexion.createStatement();
//				String request3 = "INSERT INTO Personne (nom,prenom) VALUES ('tartenpion','hubert');";
//				
//				statement3.executeUpdate(request3,Statement.RETURN_GENERATED_KEYS	);
//				
//				ResultSet resultat3 = statement3.getGeneratedKeys();
//				
//				if (resultat3.next())
//				{
//					System.out.println("Le numero genere pour cette personne :" + resultat3.getInt(1));
//				}
				
//				ResultSet result = statement.executeQuery(request);
//				
//				while (result.next()) 
//				{
//					// on indique chaque fois le nom de la colonn et le type
//					int idPersonne = result.getInt("num");
//					String nom = result.getString("nom");
//					String prenom = result.getString("prenom");
//					// pareil pour tous les autres attributs
//					System.out.println(idPersonne+" "+nom + " " + prenom );
//				}
				
//				String requestPreparee = "INSERT INTO Personne (nom,prenom)	VALUES (?,?);";
//				PreparedStatement ps = connexion.prepareStatement(requestPreparee,PreparedStatement.RETURN_GENERATED_KEYS);
//				ps.setString(1, "bordon");
//				ps.setString(2, "lucas");
//				ps.executeUpdate();
//				ResultSet resultPrepare = ps.getGeneratedKeys();
//				if(resultPrepare.next())
//					System.out.println("Le numero genere pour cette	personne : " + resultPrepare.getInt(1));
			
//			Personne p = new Personne("tutu","toto");
			PersonneDaoImpl personneDaoImpl =new PersonneDaoImpl();
//			int cle = personneDaoImpl.save(p);
//			
//			if(cle!=-1)
//				System.out.println("personne numero " + cle + " a ete inseree");
//			else
//				System.out.println("erreur d'insertion");

		
//		finally 
//		{
//			if (connexion != null)
//			{
//				try 
//				{
//					connexion.close();
//				} 
//				catch (SQLException ignore) 
//				{
//					ignore.printStackTrace();
//				}
//			}
//		}
			//Personne p1 = new Personne(1,"biheux","yoann");
			//personneDaoImpl.remove(p1);
			
//			List<Personne> l = personneDaoImpl.getAll();
//			
//			for(Personne pers:l)
//				System.out.println(pers);
			
			Personne p6 = personneDaoImpl.findById(6);
			System.out.println(p6);

	}

}
