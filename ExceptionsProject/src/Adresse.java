import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;

public class Adresse 
{
	
	private String rueString;
	private String villeString;
	private String codePostalString;
	
	public String getRueString() {
		return rueString;
	}
	public void setRueString(String rueString) throws AdresseException 
	{
		if(!rueString.equals(rueString.toUpperCase()))
			throw new AdresseException(2, rueString);	
		this.rueString = rueString;
	}
	public String getVilleString() {
		return villeString;
	}
	public void setVilleString(String villeString) {
		this.villeString = villeString;
	}
	public String getCodePostalString() {
		return codePostalString;
	}
	public void setCodePostalString(String codePostalString) throws AdresseException 
	{
		if(codePostalString.length()!=5)	
			throw new AdresseException(1,codePostalString);
		this.codePostalString = codePostalString;
	}
	public Adresse(String rueString, String villeString, String codePostalString) throws AdresseException
	{
		if(!rueString.equals(rueString.toUpperCase()) && codePostalString.length()!=5)
			throw new AdresseException(codePostalString,rueString);
		
		if(!rueString.equals(rueString.toUpperCase()))
				throw new AdresseException(2,rueString);		
		this.rueString = rueString;
		this.villeString = villeString;
		if(codePostalString.length()!=5)	
			throw new AdresseException(1,rueString);
			
		this.codePostalString = codePostalString;
			
	}
	@Override
	public String toString() {
		return "rue=" + rueString + ", ville=" + villeString + ", codePostal="
				+ codePostalString ;
	}
	
	
	
	

}
