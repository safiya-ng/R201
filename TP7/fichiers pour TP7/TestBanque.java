import java.util.ArrayList;

/**
 *  utilisation de classes existantes : pour le Tp sur les listes
 *  @author Françoise GAYRAL
 */

public class TestBanque
{
  public static void main(String[] args)	{
	CompteBancaire cb1,cb2,cb3, cb4, cb5;
	cb1 = new CompteBancaire("toto",3000f,"765TR");
	cb2 = new CompteBancaire("toto", 2000f, "TPEZ45");
	cb3 = new CompteBancaire("dudu", 2500f, "GREO5");
	cb4 = new CompteBancaire("bubu", 3400f, "FZOR32");
	cb5 = new CompteBancaire("lala", 200f, "RHED3");
	AgenceBancaire ab = new AgenceBancaire("BNP", "Villetaneuse");
	ab.ajoute(cb1);
	ab.ajoute(cb2);
	ab.ajoute(cb3);
	ab.ajoute(cb4);
	System.out.println(ab);
	System.out.println(ab.compteExiste(cb4));
	System.out.println(ab.compteExiste(cb5));
	System.out.println(ab.comptePersonneExiste("dudu"));
	System.out.println(ab.lesComptesDe("toto"));
	System.out.println(ab.lesComptesDe("lala"));


   }	// fin du main
}// fin de la classe TestBanque
