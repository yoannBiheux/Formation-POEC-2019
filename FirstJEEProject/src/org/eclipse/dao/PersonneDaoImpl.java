package org.eclipse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.config.MyConnection;
import org.eclipse.model.Personne;



public class PersonneDaoImpl implements Dao<Personne> {

	@Override
	public int save(Personne personne) {
		System.out.println("tutu");
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("insert into personne (nom,prenom) values(?,?); ",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, personne.getNom());
				ps.setString(2, personne.getPrenom());
				ps.executeUpdate();
				System.out.println(personne);
				ResultSet resultat = ps.getGeneratedKeys();
				if (resultat.next()) {
					return resultat.getInt(1);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;

	}

	@Override
	public void remove(Personne personne) 
	{
		Connection c = MyConnection.getConnection();
		String requete = "Delete from personne where num="+personne.getNum();
		if(c!=null)
		{
			try {
				if(personne.getNum()!=0)
				{
					PreparedStatement ps = c.prepareStatement(requete);
					ps.executeUpdate();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("la personne a �t� effac�e");

	}

	@Override
	public void update(Personne personne) {
		Connection c = MyConnection.getConnection();

		String requete = "update personne set nom='" + personne.getNom() + "',prenom='" + personne.getPrenom()
				+ "' where num=" + personne.getNum();

		if (c != null) {
			try {

					Statement ps = c.createStatement();
					if(personne.getNum()!=0)
					{
						int res=ps.executeUpdate(requete);
						
						System.out.println(res);
						if(res>=1)
							System.out.println("update effectu�e");
						else
							System.out.println("probleme de mise � jour");
					}
					else
					{
						System.out.println("la personne n'existe pas");
					}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public Personne findById(int id) {
		Connection c = MyConnection.getConnection();
		String requete = "SELECT * FROM personne where num=" + id;
		Personne p = new Personne();

		if (c != null) {
			try {
				Statement s = c.createStatement();
				ResultSet r = s.executeQuery(requete);
				if( r.next()){
					p.setNum(r.getInt("num"));
					p.setNom(r.getString("nom"));
					p.setPrenom(r.getString("prenom"));

				}
				else
				{
					System.out.println("personne n'existe pas");
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return p;

	}

	@Override
	public List<Personne> getAll() {
		Connection c = MyConnection.getConnection();
		String requete = "Select * from personne";
		List<Personne> listPersonnes = new ArrayList<Personne>();

		if (c != null) {
			try {
				Statement s = c.createStatement();
				ResultSet r = s.executeQuery(requete);

				while (r.next()) {
					listPersonnes.add(new Personne(r.getInt("num"),r.getString("nom"), r.getString("prenom")));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return listPersonnes;
	}

}
