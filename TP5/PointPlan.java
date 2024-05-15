public class PointPlan {
private float abscisse;
private float ordonnee;
public PointPlan() {
}
public PointPlan(float x, float y) {
this.abscisse = x;
this.ordonnee = y;
}
public PointPlan(PointPlan p) {
this(p.abscisse, p.ordonnee);
}
public float getAbscisse() {
return this.abscisse;
}
public float getOrdonnee() {
return this.ordonnee;
}
public String toString() {
return ("\n abscisse = " + this.abscisse + " ordonnee= " + this.ordonnee);
}
}