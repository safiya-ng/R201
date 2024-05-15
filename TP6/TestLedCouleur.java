import javax.swing.event.ListDataEvent;

public class TestLedCouleur {
    public static void main(String args[]){
        LedCouleur led = new LedCouleur(6001, false, "rouge");
        System.out.println(led);
        System.out.println(led.getCouleur());
        led.setCouleur("bleu");
        System.out.println(led.getCouleur());
        led.allumer();
        System.out.println(led);
        

        LedCouleur led2 = new LedCouleur();
        led2.init();
        System.out.println(led2);
    }
    
}
