public class VacheALait extends Vache {
private float lait;
/**
* Constructeur par defaut
*/
public VacheALait() { super(); }
/**
* Constructeur d'initialisation champ à champ
* @param petitNom petit nom der la vache
* @param age age de la vache
* @param poids poids de la vache
* @param panse quantité d'herbes contenu dans la panse de la
vache
* @param lait quantité de lait dans les pies de la vache
*/
public VacheALait(String petitNom, float age, float poids,
float panse, // partie implicite héritée de la classe Vache
float lait // partie explicite à la VacheALait
)
{
super(petitNom, age, poids, panse);
this.lait = lait;
}
// Methodes d'acces
public void setLait(float lait) { this.lait = lait; }
public float getLait() { return this.lait; }
// Methodes
public void brouter(float herbe, float marguerite){
super.brouter(herbe);
System.out.println("VacheALait : Je broute " + marguerite+ " kg de marguerites; un délice !");
}
/**
* La vache rumine et produit du lait!
*/
public void ruminer() {
super.ruminer();
System.out.println("VacheALait : Je produis mon lait");
this.lait = this.lait + 4;
}
public String toString() {
String s = super.toString() + "\n" + "Lait dans les pies :" + this.lait + " litres";
return s;
}
}