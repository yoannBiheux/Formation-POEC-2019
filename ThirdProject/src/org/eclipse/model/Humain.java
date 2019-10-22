package org.eclipse.model;

public class Humain<T extends Personne> 
{
	public T getVar() 
	{
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	private T var;
	

}
