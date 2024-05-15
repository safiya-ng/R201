public class Spot {
	Ampoule amp;
	Timer t;
	double frequence;

	public Spot(){
		this.amp = new Ampoule();
		this.t = new Timer();
		this.frequence = 2.0;
	}
	public Spot(Ampoule amp, Timer t) {
		this.amp = amp;
		this.t = t;
	}

	public Spot(int couleur, int puissance, double frequence) {
		this.amp = new Ampoule(couleur, puissance);
		this.frequence = frequence;
	}
	public Spot(Spot t) {
		if (t.getClass().getSimpleName() == "Spot"){
			t.amp = t.getAmpoule();
			t.t = t.getTimer();
			t.frequence = t.getFrequence();
		}
	}

	public void setFrequence(double frequence) {
		this.frequence = frequence;
	}

	public double getFrequence() {
		return this.frequence;
	}

	public int getCouleur() {
		return this.amp.getCouleur();
	}

	public int getPuissance() {
		return this.amp.getPuissance();
	}

	public Ampoule getAmpoule(){
		return this.amp;
	}

	public Timer getTimer(){
		return this.t;
	}

	public void allumer() {
		this.amp.allumer();
	}

	public void eteindre() {
		this.amp.eteindre();
	}

	public void clignoter() {
		this.allumer();
		this.eteindre();		
	}

	public void clignoter(long duree) {
		this.t.setPeriode(duree);
		this.t.activer();
		this.t.utiliser();
		System.out.println("CLIGNOTEMENT pendant " + duree +" s avec une fréquence de " + this.frequence + " Hz");
		
		
	}

	public String toString() {
		return "Spot [frequence=" + this.getFrequence() + ",  couleur=" + this.getCouleur() + ", puissance=" + this.getPuissance() + "]";
	}
}
