import java.util.Scanner;





public class Main {

	public static void main(String[] args) 
	{
		Point p1 = new Point(2,4);
		Point p2 = new Point(8,7);
		
		//System.out.println(p1.calculerDistance(p2));
		//System.out.println(p1.calculerMilieu(p2));
		/*Point premier = new Point(1,1);
		Point deuxieme = new Point(2,2);
		Point troisieme = new Point(3,2);
		TroisPoints tPoints = new TroisPoints(premier, deuxieme, troisieme);
		
		System.out.println(tPoints.testerAlignement());*/
		/*Scanner scanner= new Scanner(System.in);
		Point premier = new Point();
		Point deuxieme = new Point();
		Point troisieme = new Point();
		
		Point[] points = {premier, deuxieme,troisieme};
		int i=1;
		int j=1;
		for(Point p:points)
		{
			System.out.print("Veuillez entrer l'abscisse du "+i+"e point");
			p.setAbs(scanner.nextDouble());
			System.out.print("Veuillez entrer l'ordonnée du "+i+"e point");
			p.setOrd(scanner.nextDouble());
			i++;
		}
		for(Point p:points)
		{
			System.out.println(j+"e point["+p.getAbs()+","+p.getOrd()+"]");
			j++;
		}
		
		System.out.println("le premier segment mesure:"+points[0].calculerDistance(points[1]));
		System.out.println("le deuxieme segment mesure:"+points[0].calculerDistance(points[2]));
		System.out.println("le troisieme segment mesure:"+points[1].calculerDistance(points[2]));
		
		System.out.println("les coordonnées du milieu 1er segment :"+points[0].calculerMilieu(points[1]));
		System.out.println("les coordonnées du milieu 2e segment :"+points[0].calculerMilieu(points[2]));
		System.out.println("les coordonnées du milieu 3e segment :"+points[1].calculerMilieu(points[2]));
		
		TroisPoints tPoints = new TroisPoints(points[0], points[1], points[2]);
		String result1;
		String result2;
		
		if(tPoints.testerAlignement())
			result1="vrai";
		else
			result1="faux";
		System.out.println("Les3 points sont alignés: "+result1);
		
		if(tPoints.estTriangleEquilateral())
			result2="vrai";
		else
			result2="faux";
		System.out.println("Les3 points forment un triangle équilateral: "+result2);*/
		int[] notes = {15,11,19};
		Stagiaire st1 =new Stagiaire("biheux",notes );
		System.out.println("la moyenne de "+st1+" est de "+st1.calculerMoyenne());
		System.out.println("la note min de "+st1+" est de "+st1.trouverMax());
		System.out.println("la note max de "+st1+" est de "+st1.trouverMin());
		
		
		


		

	}

}
