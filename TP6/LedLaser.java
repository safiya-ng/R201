public class LedLaser extends Led{
    public static final double ondeMin = 1000;
    public static final double ondeMax = 2000;
    private double onde;

    public LedLaser(){
        super();
    }

    public LedLaser(int reference, boolean etat, double onde){
        super(reference, etat);
        this.onde = onde;
    }

    public LedLaser(LedLaser uneLed){
        super(uneLed);
        this.onde = uneLed.getOnde();
    }


    public boolean isLonguerOndeValide(double longueurOnde){
        if (longueurOnde >= LedLaser.ondeMin && longueurOnde <= LedLaser.ondeMax){
            return true;
        }
        else {return false;}
    }

    public double getOnde(){
        return this.onde;
    }

    public void setOnde(double newOnde){
        if(newOnde >= LedLaser.ondeMin && newOnde <= LedLaser.ondeMax){
            this.onde = newOnde;
        }
    }

    public String toString(){
        return super.toString() + "Laser : onde= " + this.getOnde();
    }
}