package org.eclipse.Test;

public class TonThread implements Runnable {
	private String nom;

	public TonThread(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(this.getNom() + " ");
		}
	}

}
