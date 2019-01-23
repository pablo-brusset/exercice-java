package exopro1;

import java.util.Scanner;

public class exopro2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Veuillez entrer votre nom: ");	
		String nom= scan.nextLine();

		nom=nom.toUpperCase();	
		System.out.println("Veuillez entrer votre prenom: ");

		String prenom= scan.nextLine();
		prenom=prenom.substring(0, 1).toUpperCase()+prenom.substring(1).toLowerCase();
		System.out.println("votre resultat: " +nom  + " "+ prenom);

	}

}
