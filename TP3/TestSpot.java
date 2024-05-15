
public class TestSpot {

	public static void main(String[] args) {
		
		Ampoule a = new Ampoule (6000,400);
		Timer t = new Timer (0.5);
		Spot s = new Spot (a,t);
		
		//Spot s = new Spot (6000,400,2)
		s.setFrequence(2);
		
		s.allumer();
		s.eteindre();
		
		s.clignoter();
		s.clignoter();
		
		System.out.println("*****************");
		
		s.clignoter(3);
		
		System.out.println(s.toString());
	}
}

/*
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
*****************
CLIGNOTEMENT pendant 3s avec une fréquence de 2.0Hz
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Allumer : + 400lm à 6000K
Eteindre : - 400lm à 6000K
Spot [frequence=2.0, couleur=6000, puissance=400]
*/
