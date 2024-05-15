public class TestBiblio {
    public static void main (String[] args){
        Livre livre1, livre2;
        livre1 = new Livre("harry potter", "jk");
        livre2 = new Livre("meurtre de RA", "Agatha c");
        Bibliotheque b1 = new Bibliotheque("edgar");
        b1.ajouterLivre(livre1);
        b1.ajouterLivre(livre2);
        System.out.println(b1);
        System.out.println(b1.chercherLivre(1));
        b1.retirerLivre(2);
        System.out.println(b1);

    }
}
