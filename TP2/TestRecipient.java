
/**
 *  teste la classe Recipient
 *
 */

public class TestRecipient
{

	public static void main(String[] args)
	{
		Recipient r1 = new Recipient();
		Recipient r2 = new Recipient("cruche", 6);
		r2.remplir();
		Recipient r3 = new Recipient("Farida", 10);
		r3.verserDans(3);
		
		int i = 0;
		System.out.println("Au début ");
		r2.afficher();
		r3.afficher();
		while ((r2.estVide() != true) && (r3.getContenu()!=r3.getCapacite())) {
			r3.verserDans(r2.prelever(1));
			System.out.println("Tour " + (i+1));
			r2.afficher();
			r3.afficher();
			i = i + 1;


		}
		System.out.println("Il a fallu faire " + i + " prélèvements");
		}

		 // fin main

} // fin class TestRecipient
