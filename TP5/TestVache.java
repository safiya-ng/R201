public class TestVache{
    public static void main(String args[]){
        Vache vero = new Vache("Vero", 3, 200.5f, 45);
        System.out.println(vero.getNom());
        System.out.println(vero);
        vero.brouter(5);
        System.out.println(vero);
        vero.ruminer();
        System.out.println(vero);

    }
}