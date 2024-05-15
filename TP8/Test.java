import java.util.ArrayList;
public class Test {
     public static void main(String[] args) {
     	Animal a;
     	a=new Animal();         
     	a.crier();         
     	a=new Chien();         
     	a.crier();         
     	ArrayList<Animal> menagerie=new ArrayList<Animal>();         
     	menagerie.add(new Chien());         
     	menagerie.add(new Animal());                 
     	menagerie.add(new Chat());         
     	for (Animal animal : menagerie)             
     	animal.crier(); 
        a=new Chat();         
        //a.manger();         
        ((Chat)a).manger();          
        //((Chien)a).manger();         
        //Chien c=new Animal();         
        //Chien c=new Chat();         
        Chien c=new Chien();         
        c.manger();         
        c.crier();         
        a=((Animal)c);         
        a.crier();     } }
