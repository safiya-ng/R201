import java.util.Scanner ;

public class LedCouleur extends Led{
    private String couleur;
    public static final String[]permises = {"rouge", "jaune", "vert", "bleu"}; 

    public LedCouleur(){
        super();
    }

    public LedCouleur(int reference, boolean etat, String couleur){
        super(reference, etat);
        for (String col : permises){
            if (couleur == col){this.couleur = couleur;}
        }
    
    }

    public LedCouleur(LedCouleur uneLed){
        super(uneLed);
        this.couleur = uneLed.getCouleur();
    }

    public String getCouleur(){
        return this.couleur;
    }

    private boolean isCouleurValide(String couleur){
        for (String col : permises){
            if (couleur == col){return true;}
        }
        return false;
    }

    public void setCouleur(String couleur){
        if (isCouleurValide(couleur)){
            this.couleur = couleur;
        }
    }

    public void init(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir la couleur de la led : ");
        String couleur = sc.nextLine();
        System.out.println("Vous avez saisi " + couleur);
        
        System.out.println("Veuillez saisir la référence de la led :");
        int ref = sc.nextInt();
        System.out.println("Vous avez saisi " + ref);
        

        System.out.println("Veuillez saisir l'etat' de la led :");
        boolean etat = sc.nextBoolean();
        System.out.println("Vous avez saisi " + etat);
        
        
        sc.close();
        super.setReference(ref);
        super.setEtat(etat);
        this.couleur = couleur;
    }

    public String toString(){
        if (super.getEtat() == true){
            return super.toString() + " Couleur= " + this.getCouleur();
        }
        return "";
    }
}
