public class Vache {
private String petitNom;
private float poids;
private float panse;
private float age;
/**
* Constructeur par défaut
*/
public Vache(){}
/**
* Constructeur d'initialisation champ à champ
* @param petitNom petit nom der la vache
* @param age age de la vache
* @param poids poids de la vahe
* @param panse quantité d'herbes contenu dans la panse de la
vache
*/
public Vache(String petitNom, float age,float poids, float
panse){
this.petitNom = petitNom;
this.poids = poids;
this.panse = panse;
this.age = age;
}
// Méthodes d'accès
public String getNom(){ return this.petitNom; }
public float getPoids(){ return this.poids; }
public float getPanse(){ return this.panse; }
public float getAge(){ return this.age; }
public void setNom( String petitNom){ this.petitNom =
petitNom; }
public void setPoids( float poids){ this.poids = poids; }
public void setPanse(float panse){ this.panse = panse; }
public void setAge(float age){ this.age = age; }
/**
* La vache broute
* @param quantite (float) : quantité en kilogramme(s) que la
vache broute
*/
public void brouter(float quantite){
System.out.println("Vache : Je broute " + quantite +" kg d'herbe, miam ! Que c'est bon !");
this.panse = this.panse + 30.0f*quantite/100;
}
/**
* La vache rumine
*/
public void ruminer(){
System.out.println("Vache : Je rumine tranquillement sous les arbres !");
if (panse-panse*30.0f/100>0.5f){
float quantite = panse*30.0f/100;
this.poids = this.poids + quantite;
this.panse = this.panse - quantite;
}
}
/**
* La vache vieillie de un an
*/
public void veillir(){
System.out.println("Vache : Je vieilli d'une année...");
this.age = this.age+1;
}
public String toString(){
String s ="Petit nom :" + this.petitNom + "\n" + "Age : "
+ this.age + "\n" + "Poids : "
+ this.poids + "\n" + "panse : " + this.panse + "kg";
return s;
}
}