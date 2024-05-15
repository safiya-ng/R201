public class TestLedLaser {
    public static void main(String args[]){
        LedLaser ledL1 = new LedLaser(6832, false, 1300);
        System.out.println(ledL1);
        System.out.println(ledL1.getEtat());
        ledL1.setEtat(true);
        System.out.println(ledL1.getEtat());
        ledL1.setOnde(500);
        ledL1.allumer();
        System.out.println(ledL1);
        ledL1.clignoter();
        System.out.println(ledL1);
    }
}
