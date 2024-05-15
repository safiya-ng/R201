import java.util.* ;

/**
 * gestion d'un paquet de cartes
 *
 */
 
public class PaquetCartesListe implements PaquetCartes
{

	private ArrayList cartes ;

	/**
	 * initialise un paquet de cartes vide
	 */
	 public PaquetCartesListe()
	 {
		this.cartes = new ArrayList<Carte>();
	 	 
	 }
	 // fin constructeur PaquetCartesListe
	
	
	/**
	 * retourne la chaine de caracteres representant le Paquet 
	 */
	public String toString()
	{
		String paquet = "";
		int i = 0;
		int lenP = this.cartes.size();
		while (i<lenP)
		{
			paquet += "Carte " + (i+1) + ": " + this.cartes.get(i).toString() + "\n";
			i++;
		}
		return paquet ; // A CHANGER
	}
   // fin methode toString
	
	
 
	/**
	 * melange le paquet de carte au hasard
	 */
 	public void melangerCartes()
 	{
 		int n = this.cartes.size() ;
 		
 								 // cree generateur de nombres aleatoires
 		Random r = new Random() ;   
 		
 		
		for (int i = 0 ; i < n ; i++)
	 	{
	 							// n-i places de i a n-1 sont a traiter
	 		int j = i + r.nextInt(n-i) ; 
	 		
								// permute elements de positions i et j
			Object o = this.cartes.set(i, this.cartes.get(j)) ;
			this.cartes.set(j,o) ;					
	 	}
 
 	}
   // fin methode battre

	// Completer en implementant les methodes abstraites de PaquetCartes
	public boolean estVide(){
		return this.cartes.size() == 0;
	}

	public int nbCartes(){
		return this.cartes.size();
	}


	public Carte regarderCarteDessous(){
		return (Carte)this.cartes.get(0);
	}

	public Carte regarderCarteDessus(){
		return (Carte)this.cartes.get(this.cartes.size()-1);
	}

	public Carte retirerCarteDessus(){
		return (Carte)this.cartes.remove(this.cartes.size()-1);
	}

	public Carte retirerCarteDessous(){
		return (Carte)this.cartes.remove(0);
	}

	public void insererCarteDessous(Carte c){
		this.cartes.add(0, c);
	}

	public void insererCarteDessus(Carte c){
		this.cartes.add(c);
	}
} // fin class PaquetCartesListe
