public class PieNoire extends VacheALait{
private int nombreTacheNoire;
private int nombreTacheBlanche;
/**
* Constructeur par defaut
*/
public PieNoire(){ super(); }
/**
* @param petitNom petit nom de la vache
* @param poids poids de la vahe
* @param panse quantité d'herbes contenu dans la panse de la
vache
* @param age age de la vache
* @param lait quantite de lait dans les pies de la vache
* @param nombreTacheNoire nombre de taches noires
* @param nombreTacheBlanche nombre de taches blanches
*/
public PieNoire( String petitNom, float age, float poids, float panse, float lait, // partie implicite de la VacheALait 
int nombreTacheBlanche, int nombreTacheNoire // partie explicite de PieNoire
){
super(petitNom, age, poids, panse, lait);
this.nombreTacheBlanche = nombreTacheBlanche;
this.nombreTacheNoire = nombreTacheNoire;
}
// Méthodes d'accès
public int getNombreTacheNoire(){ return
this.nombreTacheNoire; }
public int getNombreTacheBlanche(){ return
this.nombreTacheBlanche; }
public void setNombreTacheNoire(int nombreTacheNoire){
this.nombreTacheNoire = nombreTacheNoire; }
public void setNombreTacheBlanche(int nombreTacheBlanche){
this.nombreTacheBlanche = nombreTacheBlanche; }
// Methodes
public void brouter(float herbe, float marguerite){
super.brouter(herbe);
// La Pie Noire a "sa façon" de brouter les marguerites
System.out.println("Pie Noire : Je broute " + marguerite + " kg de marguerites; un délice !");
}
/*public void brouter(Nourriture nourriture){
System.out.println("PieNoire : Je broute "+ nourriture.toString());
}*/
public String toString(){
String s = super.toString() + "avec une robe de " + this.getNombreTacheNoire() + "tâches noires et "
+ this.getNombreTacheBlanche() + " tâches blanches";
return s;
}
}