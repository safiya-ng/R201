/** correction de CompteBancaire suite aux premiers Tps
*/


public class CompteBancaire {
   private String nom;
   private String numero;
   private float solde;

   /**
   * Constructeurs
   */
   public CompteBancaire(String nomC, String noC, float depot){
      this.nom = nomC;
      this.numero = noC;
      this.solde = depot;
   }
   public CompteBancaire(String nomC, String noC){
      this.nom = nomC;
      this.numero = noC;
   }


    // getters setters

    public String getNom(){
      return this.nom;
    }

    public String getNumero(){
      return this.numero;
    }

    public float getSolde(){
      return this.solde;
    }

    public void setNom(String nouvNom){
      this.nom = nouvNom;
    }


    public void setSolde(float nouvSolde){
      if (nouvSolde>0) {this.solde = nouvSolde;}
    }

    public String toString(){
      return new String("Compte Bancaire du client: " + this.nom +", numéro de compte : " + this.numero + 
      ", solde du compte : " + this.solde);
    }
   /**
   * ajoute 'ajout 'au solde si 'ajout' est positif et retourne true, sinon retourne false
   */
   public boolean ajouterSolde(float ajout){
      if (ajout >= 0) {
         this.solde = this.solde + ajout;
         return true;}
      else {return false;}
   }


    /**
   * retire 'retrait' au solde si 'retrait' est positif et retourne true, retourne false si 'retrait' est négatif
   */
   public boolean retraitSolde(float retrait){
      if (retrait>0){
         if ((this.solde-retrait) > 0) {
            this.solde = this.solde-retrait;
            return true;
            }
         else return false;}
      else return false;

   }

   /**
   * test si deux comptes ont memes proprietaires

   * transfert d'un compte sur un autre pour un meme proprietaire
   * le compte passé en parametre est receveur du transfert
   * la valeur est donc positive
   * renvoie faux si erreur
   * vrai si le tranfert est effectué
   * fait des affichages appropriés dans le cas d'un retour à false (3 cas)
   */

   public boolean memeProprio(CompteBancaire compte2){
      return this.nom.equals(compte2.getNom());
   }

   public void transfert(CompteBancaire compte2, float somme){
      if (this.memeProprio(compte2)){
         if (compte2.retraitSolde(somme)){
         this.ajouterSolde(somme);
         System.out.println("Le transfert a été effectué");}
         else {System.out.println("On ne peut pas transférer, somme trop élevée");}
      }
      else {System.out.println("Les propriétaires ne sont pas les mêmes");}
   }

   /*
   * retourne la conversion du solde du compte dans une monnaie dont le taux de change est passé en paramètre
   */
   public float convertitSolde(float taux){
      return this.solde*taux;
   }


}