package test2;

public class test2 {

	public static void main(String[] args) {
			
			
		 String [] tab = new String[5]; // déclaration et instanciation
		 String mot = " mot";
		 tab[0] = "Histoire";
		 tab[1]= "Géo";
		 tab[2]="math";
		 tab[3]="Francais";
		 tab[4]="svt";
		 
		 
		for (int i = 0; i < tab.length; i++) {
			String pl = tab[i].charAt(0) + "";
			String otherl = tab[i].substring(1);
			System.out.println(pl.toUpperCase()+otherl.toLowerCase());
			
			
		}
		 
		 String[] tab2 = {"Pierre","Paul","Jacquie","Mireille"};
		 if( tab2.length > 1) {
			 mot+= "s";
			 
		 }
		 System.out.println("Le tableau 2 est de longueur " + tab2.length + mot);
		 
		 for (int i = 0; i < tab2.length; i++) {
			 System.out.println(tab2[i]);
			 
			
		}
		

	}
}
