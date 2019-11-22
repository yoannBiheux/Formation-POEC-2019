package org.eclipse.nation;

import org.springframework.stereotype.Component;

@Component("fre")
public class French implements European {
	
	private int rang;

	public int getRang() {
		return rang;
	}



	public void setRang(int rang) {
		this.rang = rang;
	}



	@Override
	public int saluer(int i) {
		rang=i;
		System.out.println("Bonjour");
		return ++i;

	}

}
