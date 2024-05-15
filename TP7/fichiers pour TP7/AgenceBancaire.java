/**Fichier AgenceBancaire.java
* utilisation de classe Java ArrayList
*/
   import java.util.*;

   public class AgenceBancaire {
      private String nomAgence; 	//nom de l'agence
      private String ville; //adresse de l'agence

      private ArrayList<CompteBancaire> ensComptesBancaires = new ArrayList <CompteBancaire>(); // ensembles des comptes bancaires de l'agence


   /**
   * Constructeur
   */

      public AgenceBancaire(String nom,String adresse){
         this.nomAgence = nom;
         this.ville = adresse;
      }



   /* pour affichage ***************************************************/

       public String toString() {
         return "L'agence " + this.nomAgence + " se situe au " + this.ville + " et possède " + this.ensComptesBancaires.size() 
         + " comptes qui sont " + this.ensComptesBancaires.toString();
	}

   /* Gestion des comptes *****************************************/
   public void ajoute(CompteBancaire cb)  {
      this.ensComptesBancaires.add(cb);
	}


      public boolean compteExiste(CompteBancaire cb)  {
         return this.ensComptesBancaires.contains(cb);
      }

      public boolean comptePersonneExiste(String nom){
         for (int i = 0; i < this.ensComptesBancaires.size(); i++){
            if (this.ensComptesBancaires.get(i).getNom().equals(nom)) {
               return true;
            }
         }
         return false;
      }

      public ArrayList<CompteBancaire> lesComptesDe(String nom)  {
            ArrayList <CompteBancaire> lesComptes = new ArrayList <CompteBancaire>();
            for (int i = 0; i<this.ensComptesBancaires.size(); i++){
               if (this.ensComptesBancaires.get(i).getNom().equals(nom)){
                  lesComptes.add(this.ensComptesBancaires.get(i));
               }
            }
            return lesComptes;
      }

      public String getNomAgence(){
         return this.nomAgence;
      }

      public String getVille(){
         return this.ville;
      }

      public ArrayList getEnsCb(){
         return this.ensComptesBancaires;
      }

   //test de la classe************


   }//fin classe
