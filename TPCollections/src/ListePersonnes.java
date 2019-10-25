import java.util.HashMap;
import java.util.Map;



public class ListePersonnes 
{
	private Map<String,Personne> personnes= new HashMap();

	public Map<String, Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(Map<String, Personne> personnes) {
		this.personnes = personnes;
	}

	public ListePersonnes(Map<String, Personne> personnes) {

		this.personnes = personnes;
	}

	@Override
	public String toString() {
		return "ListePersonnes [personnes=" + personnes + "]";
	}
	
	public void ajouterPersonne(Personne p)
	{
		this.personnes.put(p.getNom()+" "+p.getPrenom(),p);
	}
	
	
	
	

}
