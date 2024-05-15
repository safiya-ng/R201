public class Test
{

	public static void main(String[] args){

        Carte c1 = new Carte(9, "coeur");
        Carte c2 = new Carte(9, "trefle");

        Carte c3 = new Carte(10, "pique");
        Carte c4 = new Carte(12, "carreau");
        System.out.println(c2.compareTo(c1));
        System.out.println(c1);

        PaquetCartesListe p1 = new PaquetCartesListe();
        p1.insererCarteDessous(c2);
        p1.insererCarteDessous(c1);
        System.out.println(p1);
        p1.insererCarteDessous(c4);
        p1.insererCarteDessus(c3);
        System.out.println(p1);
        System.out.println(p1.regarderCarteDessous());
        System.out.println(p1.regarderCarteDessus());
        
    }
    


}