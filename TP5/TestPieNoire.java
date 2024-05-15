public class TestPieNoire{
    public static void main(String args[]){
        PieNoire fille2 = new PieNoire("Fille2", 3, 200.5f, 45, 30, 4, 5);
         System.out.println(fille2.getNom());
         fille2.brouter(10, 3);
    }
}