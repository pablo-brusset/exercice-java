package test2;

import java.util.Arrays;

public class pileface {

	public static void main(String[] args) {

		String [] tab = new String[100];
		int face=0;
		int pile=0;
		for (int i = 0; i < tab.length; i++) {
			int r = (int) (Math.random()*2);
			
			//double d=(Math.random()*2);

			//System.out.println(r);
			if (r== 0) {
				//System.out.println("Face");
				tab[i]="Face";
				face++;
				

			}
			else {
				//System.out.println("Pile");
				tab[i]="Pile";
				pile++;
				
			}

		}
		System.out.println(Arrays.toString(tab));
		System.out.println(face);
		System.out.println(pile);
	}

}
