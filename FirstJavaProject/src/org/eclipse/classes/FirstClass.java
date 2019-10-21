package org.eclipse.classes;


import java.text.NumberFormat;
import java.util.Scanner;






public class FirstClass 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*for(int i=0;i<4;i++)
		{
			modulo3(scanner);
		}
		nbSup0(scanner);
		prixPhotocop(scanner);
		minMaj(scanner);
		somme100(scanner);*/
		
		//System.out.println("le résultat est :"+calculPuissance(scanner));
		
		//pyramide(scanner);
		//float [][] tab= new float[2][3];
		//float [][] tab2= new float[2][3];
		//float [][] tab3= new float[2][3];
		/*System.out.println("valeur de n: ");
		int n = scanner.nextInt();
		System.out.println("le résultat de la suite fibonacci pour "+n+" est égal à "+fib(n));*/
		//noteSup10();
		//saisieTab(tab,scanner);
		//sommeMatrice(tab,tab2,tab3,scanner);
		//int[]tab= {7,1,12,25,34,8,2,64,28,13};
		//chercherValeurTableauSeq(tab, 19, scanner);
		//chercherValeurTableauSeq(tab, 26, scanner);
		//chercherValeurTableauDich(tab,28,scanner);
		//triSelection(tab, scanner);
		//triRapide(tab,0,tab.length-1);
		calcul(scanner);
		scanner.close();
	}
	
	public static void modulo3( Scanner sc)
	{
		System.out.println("Entrez un entier");	
		int n= sc.nextInt();
		if(n%3==0)
			System.out.println(n+" est divisible par 3");
		else 
			System.out.println(n+" n'est pas divisible par 3");
		
	}
	
	public static void nbSup0(Scanner sc)
	{
		System.out.println("Entrez un nombre");
//		float nb = sc.nextFloat();
//		if(nb>0)
//		{
//			System.out.println(nb+" est supérieur à 0");
//		}
//		else if (nb==0) {
//			System.out.println(nb+"  est nul");
//			
//		}
//		else
//		{
//			System.out.println(nb+" est inférieur à 0");
//		}
//		System.out.println("Entrez un nombre");
		float nb = sc.nextFloat();
		if(nb>0)
		{
			System.out.println(nb+" est supérieur à 0");
		}
		else 
		{ 
			if (nb==0) 
			{
				System.out.println(nb+"  est nul");
			}
			else
			{
				System.out.println(nb+" est inférieur à 0");
			}
		}
	}
	public static void prixPhotocop(Scanner sc) 
	{
		NumberFormat nFormat =NumberFormat.getInstance();
		
		nFormat.setMaximumFractionDigits(2);
		boolean bool=true;
		while (bool==true) 
		{
			System.out.println("Combien de photocopies voulez-vous?");
			float nbPhot=sc.nextFloat();
			if(nbPhot<10)
			{
				System.out.println("le prix de la photocopie à l'unité est de 0,5€ et le prix à payer pour "+nbPhot+" est de "+nbPhot*0.5+"€");
			}
			else 
				{
					if(nbPhot<=20 )
					{
						System.out.println("le prix de la photocopie à l'unité est de 0,4€ et le prix à payer pour "+nbPhot+" est de "+nFormat.format(nbPhot*0.4)+"€");
					}
					else 
					{
						System.out.println("le prix de la photocopie à l'unité est de 0,3€ et le prix à payer pour "+nbPhot+" est de "+nFormat.format(nbPhot*0.3)+"€");
					}
				}
			System.out.println("voulez-vous arreter?");
			bool=sc.nextBoolean();
			
		}	
		
	}
	public static void minMaj(Scanner sc) 
	{
		char c;
		System.out.print("Entrez un caractère :");
		c = sc.next().charAt(0);
		while((c<'A') || (c>'Z'))
		{
			System.out.print("le caractère n'est pas en majuscule, recommencez :");
			c=sc.next().charAt(0);
		}
		System.out.println("la saisie est correcte");
		
	}
	public static void somme100(Scanner sc)
	{
		int som,i;
		som=0;
		i=0;
		
		while( som<=100)
		{
			i++;
			som=som+i;
		}
		System.out.println("la valeur recherchée est N="+ i);
	}
	
	public static float  calculPuissance(Scanner sc) 
	{
		float x,n;
		n=1;
		System.out.print("entrez la valeur de x: ");
		x= sc.nextInt();
		System.out.print("entrez la valeur de n: ");
		n= sc.nextInt();
		
		for(int i=1;i<n;i++)
		{
			x=x*n;
		}
		return x;

	}
	
	public static void pyramide(Scanner sc)
	{
		int rows,k=0;
		System.out.println("veuillez indiquer la taille de la pyramide: ");
		rows= sc.nextInt();
		for(int i=1;i<=rows;i++,k=0)
		{
			
			for(int space=1;space<=rows-i;space++)
			{
				System.out.print(" ");
			}
			while(k!=2*i-1)
			{
				System.out.print("x ");
				k++;
			}
			System.out.println();
			
		}
	}
	
	public static int fib(int n)
	{
		int res;
		if(n==0 || n==1)
			res=1;
		else 
			res=fib(n-2)+fib(n-1);
		
		return res;

	}
	
	public static void noteSup10()
	{
		int i,nbr=0;
		float [] notes = {10,5,17,18,14,9,8,11,9,13};
		
		
		
		for(i=0;i<notes.length;i++)
		{
			if(notes[i]>10)
			{
				nbr=nbr+1;
			}
		}
		System.out.println("le nombre de notes supérieures à 10 est de : "+nbr);
		
		//parcourir un tabeau for
		//for(i=0;i<notes.length;i++)
		//{
		//	System.out.println(notes[i]);
		//}
		// écriture simplifiée
		for (float f:notes)
			System.out.println(f);
		
	}
	
	public static void saisieTab(float [] tab,Scanner sc)
	{
		int i;
		
		for (i=0;i<tab.length;i++)
		{
			System.out.println(" saisie de l'élément : "+(i+1));
			tab[i]= sc.nextFloat();
			
			
		}
		affTab(tab);
	}
	
	public static void affTab(float[] tab)
	{
		//int i,nbr=0;
		
		//parcourir un tabeau for
		//for(i=0;i<tab.length;i++)
		//{
		//	System.out.println(tab[i]);
		//}
		// écriture simplifiée
		for (float f:tab)
			System.out.println(f);
		
	}
	
	public static void saisieMatrice(float[][] tab,Scanner sc)
	{
		int i,j;
		for(i=0;i<tab.length;i++)
		{
			System.out.println("saisie ligne"+(i+1));
			
			for(j=0;j<tab[i].length;j++)
			{
					System.out.println("Entre l'élément de la ligne "+(i+1)+" et de la colonne "+(j+1));
					tab[i][j]=sc.nextFloat();					
			}			
		}
		affichMatrice(tab);
	}
	
	public static void affichMatrice(float[][] tab)
	{
		for(int i=0;i<tab.length;i++)
		{
			for(int j=0;j<tab[i].length;j++)
			{
				System.out.println("tab["+i+"]["+j+"]="+tab[i][j]);
			}
		}
	}
	
	public static void sommeMatrice(float[][]tab,float[][]tab2,float[][]tab3,Scanner sc)
	{
		saisieMatrice(tab, sc);
		saisieMatrice(tab2, sc);
		for(int i=0;i<tab.length;i++)
		{
			for(int j=0;j<tab[i].length;j++)
			{
				tab3[i][j]=tab[i][j]+tab2[i][j];
			}
		}
		System.out.println("Affiche la matrice tab3:");
		affichMatrice(tab3);
	
	}
	
	public static void chercherValeurTableauSeq(int[] tab,int x,Scanner sc)
	{
		boolean found=false;
		for(int i=0;i<tab.length;i++)
		{
			if(tab[i]==x)
			{
				found=true;
				break;
			}
			else
				found=false;
			
		}
		if(found)
			System.out.println(x+" appartient au tableau");
		else
			System.out.println(x+" n'appartient au tableau");
	}
	public static void chercherValeurTableauDich(int[] tab,int x,Scanner sc)
	{
		int inf=0,sup=tab.length-1;
		boolean trouve=false;
		
		while((inf<=sup) && (trouve==false))
		{
			int milieu=(inf+sup)/2;
			if(x==tab[milieu])
				trouve=true;
			else if (x>tab[milieu]) 
			{
				inf=milieu+1;
			}
			else
				sup=milieu-1;
		}
		
		if(trouve)
			System.out.println(x+" appartient au tableau");
		else 
			System.out.println(x+" n'appartient pas au tableau");
		
	}
	
	public static void triSelection(int []tab,Scanner sc)
	{
		
		for(int i=0;i<tab.length-2;i++)
		{
			int indPos=i;
			for(int j=i+1;j<=tab.length-1;j++)
			{
				if(tab[j]<tab[indPos])
					indPos=j;
			}
			int temp=tab[indPos];
			tab[indPos]=tab[i];
			tab[i]=temp;
		}
		for(int k=0;k<tab.length;k++)
		{
			System.out.println("tab["+k+"]="+tab[k]);
		}
		
	}
	
	
	public static void triRapide(int[] tab,int p,int r)
	{
		int q=-1;
		if(p<r)
		{
			q=partition(tab, p,r);
			triRapide(tab, p,q-1);
			triRapide(tab, q+1,r);
			for(int k=0;k<tab.length;k++)
			{
				System.out.println("tab["+k+"]="+tab[k]);
			}
		}
		
			
	}
	public static int partition(int[] tab,int p,int r)
	{
		int i,j,pivot;
		pivot=tab[p];
		i=p+1;
		j=r;
		while(i<=j)
		{
			while((i<=r) && (tab[i]<=pivot))
			{
				i++;
			}
			while((j>=p) && (tab[j]>pivot))
			{
				j--;
			}
			if(i<j)
			{
				int temp=tab[i];
				tab[i]=tab[j];
				tab[j]=temp;
				i++;
				j--;
				
			}
		}
		
		int temp2=tab[j];
		tab[j]=tab[p];
		tab[p]=temp2;

		return j;
	}
	
	public static void calcul(Scanner sc)
	{
		float nb1,nb2,result=0;
		char operateur;
		boolean error=false;
		System.out.println("Tapez un chiffre :");
		nb1=sc.nextFloat();
		System.out.println("Tapez un 2e chiffre :");
		nb2=sc.nextFloat();
		System.out.println("quelle opération voulez vous faire?");
		operateur=sc.next().charAt(0);
		switch (operateur) 
		{
			case '+':
				result=nb1+nb2;
				break ;
			case '-':
				result=nb1-nb2;
				break;
			case '*':
				result=nb1*nb2;
				break;
			case '/':
				if(nb2!=0)
					result=nb1/nb2;
				else 
					System.out.println("la division par 0 est impossible");
				
				break;
			default:
				error=true;
				System.out.println(operateur+" n'est pas un opérateur");
				break;
		}
			
		if(error)
			System.out.println("l'opération est impossible");
		else 
			System.out.println(""+nb1+""+operateur+""+nb2+"="+result);
			
		
		
	}
	
	
}
	



