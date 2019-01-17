package test2;

import java.util.Arrays;

// Fonction qui à pour paramètre un entier T qui génére une matrice aléatoir (commis entre 0 et 100)
// Fonction qui à pour paramètre une matrice et qui affiche cette matrice.

public class matricealea {

	public static int[] [] matriceAlea(int ligne,int colonne,int nbaAleamax ) {

		int [][] tab= new int [ligne] [colonne];
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {

				tab [i][j] = nbAlea(100);	
				//System.out.println("i="+ i + "j =" + j);
				//System.out.println("table de i" + Arrays.toString(tab[i]));
				//System.out.println("element i j "+ tab [i] [j]);
			}	
		}
		return tab; 
	}

	public static void affiche(int [][] tab ) {
		for (int i = 0; i < tab.length; i++) {
			int[] ligne = tab[i];
			for (int j = 0; j < ligne.length; j++) {
				System.out.print(tab[i][j]+ " ");
			}
			System.out.println();
		}

	}// Fonction qui retourne le nombre aleatoire entre 0 et Max.
	public static int nbAlea(int max) {
		return (int)(Math.random()* max);

	}
	public static void main(String[] args) { 
		int [][] tab = matriceAlea(3, 5, 100);
		affiche(tab);
	}
}