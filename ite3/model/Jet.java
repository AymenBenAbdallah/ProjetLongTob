package model;
/**
 * 
 * Un jet sera vu comme un ensemble de d�s
 *
 */


public class Jet {
	
	private Des[] d�s;
	private int somme; //la somme de tous les d�s
	
	public Jet(int nombreD�s, int face) {
		this.somme = 0;
		this.d�s = new Des[nombreD�s];
		for(int i = 0 ; i<nombreD�s;i++) {
			this.d�s[i] = new Des(face);
			this.d�s[i].lancer();
			this.somme += this.d�s[i].getValeur();
		}
		
		
	}
	
	public int getSomme() {
		return this.somme;
	}

}
