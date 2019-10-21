

public class Formation 
{
	private String intitule;
	private int nbJours;
	private Stagiaire [] stagiaires;
	
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getNbJours() {
		return nbJours;
	}
	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}
	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}
	public void setStagiaires(Stagiaire [] stagiaires) {
		this.stagiaires = stagiaires;
	}
	
	public double CalculerMoyenneFormation(Stagiaire[] stagiaires)
	{
		double moy=0;
		int i;
		
		for(i=0;i<this.getStagiaires().length;i++)
		{
			moy=moy+this.getStagiaires()[i].calculerMoyenne();
		}
		
		
		return moy/(this.getStagiaires().length-1);
	}
	
	public int getIndexMax(Stagiaire[] stagiaires)
	{
		double moyMax=20;
		int indice=0;
		for(int i=0;i<stagiaires.length;i++)
		{
			if(stagiaires[i].calculerMoyenne()<moyMax)
			{
				moyMax=stagiaires[i].calculerMoyenne();
				indice=i;
			}
		}
		return indice;

	}
	public int getIndexMin(Stagiaire[] stagiaires)
	{
		double moyMin=0;
		int indice=0;
		for(int i=0;i<stagiaires.length;i++)
		{
			if(stagiaires[i].calculerMoyenne()>moyMin)
				moyMin=stagiaires[i].calculerMoyenne();
		}
		return indice;

	}
	
	public String afficherNomMax(Stagiaire[] stagiaires)
	{
		String nomMax="";
		double moyMax=20;
		for(int i=0;i<stagiaires.length;i++)
		{
			if(stagiaires[i].calculerMoyenne()<moyMax)
			{
				moyMax=stagiaires[i].calculerMoyenne();
				nomMax=stagiaires[i].getNom();
			}
		}
		return nomMax;

	}
	
	public double afficherMinMax()
	{
		return 0;
	}

	
	
	
	
}
