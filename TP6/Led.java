import java.util.Scanner ;

/**
 * 
 * @author bouchaibkhafif
 * Led  V.1.0
 * 
 * reproduction interdite sans l'autorisation del'auteur
 */
public class Led {
	private int reference;   // Reference de la Led
	private boolean etat;	// Etat de la Led allumee ou eteinte

	
	/**
	 * Constructeur par defaut
	 */
	public Led(){
	
	}
	
	
	/**
	 * Constructeur  
	 * @param reference : reference de la Led
	 * @param etat	: etat de la Led allumee ou eteinte
	 */

	public Led(int reference, boolean etat){
		this.reference = reference;
		this.etat = etat;
	}
	
	
	/**
	 * Constructeur par copie
	 * @param uneLed
	 */
	public Led(Led uneLed){
		this.reference = uneLed.getReference();
		this.etat = uneLed.getEtat();	
	}
	
	public int getReference() {
		return reference;
	}


	public void setReference(int reference) {
		this.reference = reference;
	}


	public boolean getEtat() {
		return etat;
	}


	public void setEtat(boolean etat) {
		this.etat = etat;
	}



	/**
	 * Allume la Led
	 */
	public void allumer(){
		this.etat = true;
	}
	
	/**
	 * Eteint la Led
	 */
	public void eteindre(){
		this.etat = false;
	}
	
	
	/**
	 * Fait clignoter la Led une fois
	 * Inverse l'etat de la Led
	 */
	
	public void clignoter(){
		this.etat = !this.etat;
	}
	
	
	/**
	 * toString()
	 */
	public String toString() {
		return "Led [etat=" + this.getEtat() + ", reference=" + this.getReference() + "]";
	}



}
