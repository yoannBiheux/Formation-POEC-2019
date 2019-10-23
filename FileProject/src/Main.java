import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args)
	{

//		File monFichier = new File("nomDuFichier.txt");
//		try 
//		{
//			if(monFichier.createNewFile())
//				System.out.println("Le fichier a été crée");
//		} 
//		catch (IOException e) 
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//lireStream();
		//EcrireStream();
		//BufferRead();
		ecrireBufferedWritter();
		
		

	}
	
	
	public static void lireStream()
	{
		FileInputStream fis =null;
		
		try
		{
			fis= new FileInputStream((new File("Test.txt")));
			byte[] buffer = new byte[8];
			int n=0;
			while((n=fis.read(buffer))>=0)
				for(byte b:buffer) System.out.println(b);
			
			fis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void EcrireStream()
	{
		
	}
	
	public static void BufferRead()
	{
		BufferedReader bReader =null;
		String ligne= "";
		try
		{
			bReader = new BufferedReader(new FileReader("Test.txt"));
			// lire un fichier en entier 1ere methode
			while((ligne=bReader.readLine()) != null)
			{
				System.out.println(ligne);
			}
			//lire une fichier en entier 2e methode
			ligne = bReader.readLine();			
			while(ligne!=null)
			{
				System.out.println(ligne);
				
				bReader.readLine();
			}
			bReader.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void ecrireBufferedWritter()
	{

			BufferedWriter bw = null;
			try {
			bw = new BufferedWriter( new FileWriter("Test.txt",true));
			bw.write("Toto");
			bw.close();
			} catch(FileNotFoundException e) {
			e.printStackTrace();
			} catch(IOException e) {
			e.printStackTrace();
			}

	}

}
