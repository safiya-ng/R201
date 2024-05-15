
import java.lang.Exception;
import java.util.* ;

/**
 * gestion d'un paquet de cartes
 *
 */
 
public class PaquetCartesTableau implements PaquetCartes
{
	int pos                       ;    /* position de la prochaine carte a inserer */
	private Carte[] cartes        ;
	
		
	/**
	 * initialise un paquet de cartes (reserver pour 52 cartes)
	 */
	 public PaquetCartesTableau()
	 {
		this.cartes = new Carte[52];
	 	this.pos = 0;
	 }
	 // fin constructeur PaquetCartesListe
	
	

	/**
	 * version toString avec for
	 */
	public String toString()
	{
		String chaine = "" ;
		
		
	 
	 	return chaine ;
	}
   // fin methode toString


	/**
	 * retourne la carte situee sur le dessus (fin) du Paquet
	 */
   public Carte regarderCarteDessus() throws Exception
   {
	    
	      
	   return null ;
	      
   }
   // fin methode retireCarte


	/**
	 * retourne la carte situee sur le dessous (debut) du Paquet
	 */
   public Carte regarderCarteDessous() throws Exception
   {
	   return null ;
	 
   }
   // fin methode regardeCarteDessus


   /**
	 * retourne la carte situee sur le dessus (fin) du Paquet
	 */
   public Carte retirerCarteDessus()
   {
	   return null ;

   }
   // fin methode retireCarte
	
	
	 /**
	 * retourne la carte situee sur le dessous (debut) du Paquet
	 * (suppose que le paquet n'est pas vide)
	 */
   public Carte retirerCarteDessous() 
   {
	   return null ;
   }
   // fin methode retireCarte
	
	
	/**
	 * insere la carte sur le dessous du Paquet
	 * (suppose que le paquet n'est pas plein)
	 * 
	 */
	public void insererCarteDessous(Carte c) 
	{
		
	}
   // fin methode insereCarte
 
 
 	/**
	 * insere la carte sur le dessus du Paquet
	 * (suppose que le paquet n'est pas plein)
	 * 
	 */
	public void insererCarteDessus(Carte c) 
	{
	}
   // fin methode insereCarte
 
 
	/**
	 * melange le paquet de carte au hasard
	 */
 	public void melangerCartes()
 	{
 		int n = this.cartes.length ;
 		
 								 // cree generateur de nombres aleatoires
 		Random r = new Random() ;   this.pos = 0;
	
	 		
								// permute elements de positions i et j
	 		Carte c = this.cartes[i] ;
			this.cartes[i] = this.cartes[j] ;
			this.cartes[j] = c ;					
}
 	
   // fin methode battre


  	/**
	 * retourne true si le paquet est vide
	 */
   public boolean estVide()
   {
	   return this.cartes.length == 0 ;
   }
   // fin methode estVide
   
   
   	/**
	 * retourne le nombre de cartes dans le paquet
	 */
   public int nbCartes() 
   {
	   return this.cartes.length ;// completer/modifier
   }
   
} // fin class PaquetCartesListe
