
public class TroisPoints 
{
	private Point premier;
	private Point deuxieme;
	private Point troisieme;
	
	public Point getPremier() {
		return premier;
	}
	public void setPremier(Point premier) {
		this.premier = premier;
	}
	public Point getDeuxieme() {
		return deuxieme;
	}
	public void setDeuxieme(Point deuxieme) {
		this.deuxieme = deuxieme;
	}
	public Point getTroisieme() {
		return troisieme;
	}
	public void setTroisieme(Point troisieme) {
		this.troisieme = troisieme;
	}
	public TroisPoints(Point premier, Point deuxieme, Point troisieme) {

		this.premier = premier;
		this.deuxieme = deuxieme;
		this.troisieme = troisieme;
	}
	
	public boolean testerAlignement()
	{
		//distance  premier-deuxieme point
		double dist1=this.premier.calculerDistance(this.deuxieme);
		double dist2 = this.premier.calculerDistance(this.troisieme);
		double dist3 = this.deuxieme.calculerDistance(this.troisieme);
		
		if((dist1==(dist2+dist3))||(dist2==(dist1+dist3))||(dist3==(dist2+dist1)))
		{
			return true;
		}
		else
			return false;

	}
	
	public boolean estTriangleEquilateral()
	{
		//distance  premier-deuxieme point
		double dist1=this.premier.calculerDistance(this.deuxieme);
		double dist2 = this.premier.calculerDistance(this.troisieme);
		double dist3 = this.deuxieme.calculerDistance(this.troisieme);
		
		if(dist1==dist2 && dist2==dist3 && dist1==dist3)
		{
			return true;
		}
		else
			return false;

	}
	

}
