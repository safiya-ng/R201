public class Ampoule {
	private int couleur;
	private int puissance;


	public Ampoule() {
		this.couleur = 0;
		this.puissance = 0;
	
	}

	public Ampoule(int couleur, int puissance) {
		this.couleur = couleur;
		this.puissance = puissance;
	}
	public Ampoule(Ampoule a) {
		if (a.getClass().getSimpleName() == "Ampoule"){
		this.couleur = a.getCouleur();
		this.puissance = a.getPuissance();}
	}

	public void allumer() {
		System.out.println("Allumer: +" + this.puissance + " à " + this.couleur + " K");
	}

	public void eteindre() {
		System.out.println("Eteindre: -" + this.puissance + " à " + this.couleur + " K");
	}

	public int getCouleur() {
		return this.couleur;
	}

	public void setCouleur(int couleur) {
		this.couleur = couleur;
	}

	public int getPuissance() {
		return this.puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public String toString() {
		return "C'est une ampoule de puissance " + this.puissance + " Lumens et de température " + this.couleur + " Kelvin";
	}
}
