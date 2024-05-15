import java.awt.*;

public class Triangle	{
// variable d'instance
private PointPlan[] sommets;



// ào compléter
public Triangle(){
    sommets = new PointPlan[3];
}

public Triangle(PointPlan p1, PointPlan p2, PointPlan p3)	{
    sommets = new PointPlan[3];
    this.sommets[0] = p1;
    this.sommets[1] = p2;
    this.sommets[2] = p3;
}

public Triangle(PointPlan[] tabPoints)	{
    this.sommets = tabPoints;
}

public void setPoint(PointPlan p, int i) {
    this.sommets[i] = p;
}

public PointPlan getPoint(int i) {
	return this.sommets[i];
}
public String toString()	{
	return "Point A: " + this.sommets[0] + "; Point B: " + this.sommets[1] + "; Point C: " + this.sommets[2];
}

public void translate(int dx, int dy)	{
    for (int i=0; i<3; i++){
        this.sommets[i].translater(dx, dy);
    }
}

}

