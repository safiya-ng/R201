import java.util.Scanner;

public class PointPlan {

	private float abscisse;
	private float ordonnee;

	public PointPlan() {
		this.abscisse = 0;
		this.ordonnee = 0;
	}

	public PointPlan(float x, float y) {
		this.abscisse = x;
		this.ordonnee = y;
	}

	public PointPlan(PointPlan p) {
		this.abscisse = p.getAbscisse();
		this.ordonnee = p.getOrdonnee();
	}

	private float getOrdonnee() {
		return this.ordonnee;
	}

	private float getAbscisse() {
		return this.abscisse;
	}

	public PointPlan inverse() {
		PointPlan p = new PointPlan(this.getAbscisse(), this.getOrdonnee());
		return p;
	}

	public boolean egaleA(PointPlan p) {
		return (this.getAbscisse() == p.getAbscisse() && this.getOrdonnee() == p
				.getOrdonnee());
	}

	public void init() {
		Scanner input = new Scanner(System.in);

		System.out.print("Abscisse ? ");
		this.abscisse = input.nextInt();
		System.out.print("Ordonnée ? ");
		this.ordonnee = input.nextInt();
	}

	public void translater(float dx, float dy) {
		this.abscisse = this.abscisse + dx;
		this.ordonnee = this.ordonnee + dy;
	}

	public double distance() {
		return Math.sqrt(this.abscisse * this.abscisse + this.ordonnee
				* this.ordonnee);
	}

	public String toString() {
		return "(" + this.getAbscisse() + "," + this.getOrdonnee() + ")";
	}

	public void affiche() {
		System.out.println(this.toString());
	}
}
