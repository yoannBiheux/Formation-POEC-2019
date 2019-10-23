import Exceptions.OperationExceptions;


public class Operation 
{
	private Nombre nombre;

	public Nombre getNombre() {
		return nombre;
	}

	public void setNombre(Nombre nombre) {
		this.nombre = nombre;
	}

	public Operation(Nombre nombre) 
	{
		this.nombre = nombre;
	}
	
	public  int division() throws OperationExceptions
	{
		if(this.getNombre().getVar2()==0)
			throw new OperationExceptions(1);		
		return this.getNombre().getVar1()/this.getNombre().getVar2();
	}
	
	public int racineDeLaSomme() throws OperationExceptions
	{
		if((this.getNombre().getVar1()+this.getNombre().getVar2())<0)
			throw new OperationExceptions(2);
		
		return 0;
	}
	
	
	

}
