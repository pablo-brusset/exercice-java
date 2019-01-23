package exopro1;

import java.util.Scanner;

public class exopro1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Veuillez choisir un premier chiffre: ");
		try {
			int i =sc.nextInt();
			System.out.println("veuillez choisir un second chiffre: ");
			
			int x =sc.nextInt();
			System.out.println("Le resultat est: " +(i + x ));
		}
		catch (Exception e) {
			System.out.println("Un chiffre ! ");
		}
	}
		
}
