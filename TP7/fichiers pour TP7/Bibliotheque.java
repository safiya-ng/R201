import java.util.ArrayList;
import java.util.ListIterator;

public class Bibliotheque {
    private String nom ;
    private ArrayList<Livre> livres = new ArrayList<Livre>();
    private int numero ;

    public Bibliotheque(String unNom){
        this.nom = unNom;
    }
    public void ajouterLivre(Livre livre) {
        if (livres.size() > 0){
            livre.setNumero((livres.get(livres.size()-1).getNumero())+1);
            
        }
        else{livre.setNumero(1);}
        livres.add(livre);
    }


    public String getNom() {
        return this.nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Livre chercherLivre(int num) {
        if (this.livres.size() > 0){
            return this.livres.get(num-1);
        }
        else {return null;}
    }
    public void retirerLivre(Livre l) {
        this.livres.remove(l);
    }
    public void retirerLivre(int num) {
        ListIterator<Livre> i = this.livres.listIterator();
        while (i.hasNext()){
            Livre l = i.next();
            if (l.getNumero() == num) {i.remove();}
        }
    }
    
    public String toString(){
        String lesLivres = "";
        for (int i =0; i<this.livres.size(); i++){ lesLivres+=this.livres.get(i).toString();}
        return "La bibliotheque " + this.nom + " possède " + this.livres.size() + " livres " + lesLivres; 
    }
    /*public boolean equals (Object obj)
	{
	if (obj == null || obj.getClass() != this.getClass()) {return false; }
	CompteBancaire c = new CompteBancaire(obj);
	return this.nom.equals(c.get(Nom()) && this.numero == c.getNumero();
	}*/
    }
