package exopro1;

public class exo420 {

	public static int affichage(int[] tab) {
		int nbmax=0;

		for (int i = 0; i < tab.length ; i ++) {

			if (tab[i] > nbmax ){
				nbmax=tab[i];
			}
		}

		return nbmax;
	}
	public static void main(String[] args) {
		int tab []= {3,6,98,3,1};

		System.out.println(affichage(tab));
	}

}

