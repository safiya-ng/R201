/**
 *  utilisation de classes existantes
 *  @author Françoise GAYRAL
 */

import java.util.*;
public class TestUtilisationClasses
{
  public static void main(String[] args)	{
	// Pour l'exo 2 sur les chaînes : utilisation de la classe String
	String sb = "Bonjour tout le monde";
	String m = new String("monde");
	String mb = "    monde        "; //4 blancs au départ, 8 blancs à la fin
	String me = "et merci";
	// à compléter  
	// 2.a)
	System.out.println("longueur de m : " + m.length() + ", longueur de mb: " + mb.length());
	// 2.B)
	System.out.println("longueur de mb après avoir enlever les espaces: " + mb.trim().length());
	// 2.C
	System.out.println("premier caractere : " + m.charAt(0));
	// 2.D
	String sbminus = sb.toLowerCase();
	System.out.println(sbminus);
	// 2.E
	String m1=m.replace("", "-");
	m1.substring(1, m.length()-1);
	System.out.println(m1);
	//for (int i=0; i<5; i=i+1){System.out.println(m.charAt(i));}

	//2.F
	if (m.equals(sb)) {System.out.println(m + " est égal à " + sb);}
	else {System.out.println(m + " n'est pas égal à "+ sb);}
	//2.G
	System.out.println(sb.endsWith(m));
	if (sb.endsWith(m)) {System.out.println(sb + " se termine par " + m);}
	else {System.out.println(sb  + " ne se termine pas par " + m);}
	//2.H
	if (sb.contains(m)){System.out.println(sb + " contient la chaine " + m + ", Il se trouve a l'indice " 
	+ sb.indexOf(m));
	}
	//2.I
	sb = sb + me;
	System.out.println(sb);
	//2.J
	sb = sb.replace("o", "i");
	System.out.println(sb);
	//2.K
	Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.println("Ecrire un nombre: ");

        //Lit l'entier écrit par l'utilisateur et l'affecte 
        // à  la variable nombre du programme
        int nombre = scanner.nextInt();
        // Affiche le nombre saisit par l'utilisateur
        System.out.println(nombre);

   }	// fin du main
}// fin de la classe TestUtilisationClasses
