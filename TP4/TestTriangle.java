public class TestTriangle{
    public static void main(String[] args){
        PointPlan p1 = new PointPlan(3.2f, 4.5f);
        PointPlan p2 = new PointPlan();
        PointPlan p3 = new PointPlan(8.9f, 5.0f);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p1, p2, p3);

        System.out.println(t1.getPoint(0));
        System.out.println(t2.getPoint(2));
        System.out.println(t2);
        t2.translate(1, 2);
        System.out.println(t2);

        t1.setPoint(p1, 1);
        System.out.println(t1);
    }
}