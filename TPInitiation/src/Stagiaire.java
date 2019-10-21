

public class Stagiaire 
{
	private String nom;
	private int[] notes=new int[3];
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int[] getNotes() {
		return notes;
	}
	public void setNotes(int[] notes) {
		this.notes = notes;
	}
	public Stagiaire(String nom, int[] notes) {

		this.nom = nom;
		this.notes = notes;
	}
	
	
	public Stagiaire() 
	{

	}
	public double calculerMoyenne()
	{

		return (this.notes[0]+this.notes[1]+this.notes[2])/notes.length;
	}
	
	public int trouverMax()
	{
		int maxNote=20;
		for(int i=0;i<this.notes.length;i++)
		{
			if(notes[i]<maxNote)
				maxNote=notes[i];
		}
		return maxNote;

	}
	public int trouverMin()
	{
		int minNote=0;
		for(int i=0;i<this.notes.length;i++)
		{
			if(notes[i]>minNote)
				minNote=notes[i];
		}
		return minNote;

	}
	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + "]";
	}
	
	
	

}
