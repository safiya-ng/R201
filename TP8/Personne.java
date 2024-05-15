public class Personne {
private String nom ;
private int age ;
public Personne(String unNom, int unAge) {
    this.nom = unNom;
    this.age = unAge ;
} 

public boolean equals(Object o)  {
 if (o==null) return false;
   if (!(o instanceof Personne)) return false;
     Personne p = (Personne) o;
       return (this.nom.equals(p.nom) && this.age==p.age) ; } }
