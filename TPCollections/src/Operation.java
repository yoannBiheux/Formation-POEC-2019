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
	
	public  double division() throws OperationExceptions
	{
		if(this.getNombre().getVar2()==0)
			throw new OperationExceptions(1);		
		return this.nombre.getVar1()/this.nombre.getVar2();
	}
	
	public double racineDeLaSomme() throws OperationExceptions
	{
		
		if((this.nombre.getVar1()+this.nombre.getVar2())<0)
			throw new OperationExceptions(2);
		
		return Math.sqrt((double)this.nombre.getVar1()+this.nombre.getVar2());
	}
	
	
	

}
