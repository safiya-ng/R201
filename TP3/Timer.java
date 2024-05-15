public class Timer {
	
	private double periode;
	private boolean etat;

	/**
	 * Constructeur par défaut : période nulle
	 */
	public Timer() {
		this(0);
	}

	/**
	 * Constructeur
	 * @param periode : période du timer en secondes
	 */
	public Timer(double periode) {
		this.etat = false;
		this.periode = periode;
	}
	
	public Timer(Timer t)
	{
	    this.setPeriode(t.getPeriode()) ;
	    this.setEtat(t.getEtat()) ;
	}



	/**
	 * Modificateur
	 * @param periode : nouvelle période du timer
	 */
	public void setPeriode(double periode) {
		this.periode = periode;
	}
	
	public void setEtat(boolean e)
	{
	    this.etat = e ;
	}

	/**
	 * Accesseur
	 * @return la période du timer
	 */
	public double getPeriode() {
		return periode;
	}

    public boolean getEtat()
    {
        return this.etat ;
    }

	/**
	 * Activation du timer : après activation, l'utilisation du timer est effective
	 */
	public void activer() {
		this.etat = true;
	}

	/**
	 * Désactivation du timer : après désactivation, l'utilisation du timer est inopérante
	 */
	public void desactiver() {
		this.etat = false;
	}

	/**
	 * Utilisation du timer : le programme appelant suspend son exécution pour
	 * un nombre de secondes correspondant à la période tu timer
	 */
	public void utiliser() {
		if (this.etat) {
			try {
				Thread.sleep((int)(this.periode*1000));
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	/**
	 * @return Chaîne de caractères représentant l'instance
	 */
	public String toString() {
		return "Timer [periode=" + periode + ", etat=" + etat + "]";
	}

	/**
	 * (non-javadoc)
	 */
	public static void main(String[] args) {
		Timer t = new Timer(1);
		
		System.out.println(t);
		for (int i=0 ; i<5 ; i++) {
			t.utiliser();
			System.out.print("*");
		}
		
		t.activer();
		t.setPeriode(0.5);
		System.out.println(t);
		for (int i=0 ; i<5 ; i++) {
			t.utiliser();
			System.out.print("X");
		}
		
		t.desactiver();
		t.setPeriode(1);
		System.out.println(t);
		for (int i=0 ; i<5 ; i++) {
			t.utiliser();
			System.out.print(".");
		}		
		
	}
}
