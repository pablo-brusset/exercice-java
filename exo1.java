package page2exo1;

import java.util.Scanner;


public class exo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // saisie utilisateur

		char[]voyelle= {'a','e','i','o','u','y'}; // tableau de voyelle
		int [] count= new int[voyelle.length]; // compteur

		System.out.println("donner un mot: ");
		String saisie = sc.nextLine();
		saisie=saisie.toLowerCase();// permet de compter aussi les majuscules
		
		char[] carac = saisie.toCharArray(); // permet de mettre la chaine de caractere en caractere individuel.

		for(int i= 0; i < carac.length; i ++) {

			for(int j =0; j< voyelle.length; j++){
				if(carac[i]== voyelle[j]) {
					count[j] +=1;

				}
			}
		}
		for(int i = 0; i < count.length; i ++) 

				System.out.println(" la voyelle " + voyelle[i] + " est presente " + count[i]+ " fois");
		sc.close();

			


		}


	}

