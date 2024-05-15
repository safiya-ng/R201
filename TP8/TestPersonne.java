public class TestPersonne {
    public static void main(String[] args) {         
        Object p1 = new Personne("Toto", 30) ;
        Personne p2 = new Personne("Toto", 30) ;
        if(p1.equals(p2))
            System.out.println("EGALES") ;
        else
            System.out.println("DIFFERENTES") ;
    }
  }
