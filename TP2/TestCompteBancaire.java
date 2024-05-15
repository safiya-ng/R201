/******************** Test de la classe *****************************/

public class TestCompteBancaire
{

public static void main(String args[]) {
    CompteBancaire c1 = new CompteBancaire("Toto", "12345", 123);
    CompteBancaire c2 = new CompteBancaire("Stitch", "00000");
    CompteBancaire c3 = new CompteBancaire("Titi", "13456", 454);
    System.out.println("le nom de c1: " + c1.getNom());
    c1.setNom("Titi");
    System.out.println("le nouveau nom de c1: " + c1.getNom());
    System.out.println("Le solde du compte c1: " + c1.getSolde());
    
    System.out.println("Le numero de c2: " + c2.getNumero());
    System.out.println("Le nouveau numéro de c2: " + c2.getNumero());
    System.out.println(c1);
    System.out.println(c1.ajouterSolde(-150));
    System.out.println(c1.ajouterSolde(32));
    System.out.println("Solde du compte c1: "+ c1.getSolde());
    System.out.println(c1.retraitSolde(200));
    System.out.println(c1.retraitSolde(32));
    System.out.println("Solde du compte c1 " + c1.getSolde());
    System.out.println(c1.memeProprio(c3));
    System.out.println(c1.memeProprio(c2));
    c1.transfert(c2, 45);
    c3.transfert(c1, 200);
    c1.transfert(c3, 222);
    System.out.println(c1.convertitSolde(2.33f));
    System.out.println(c1.getSolde());
}// fin du main
} // fin de la classe

