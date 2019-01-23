package page2exo1;

import java.util.Scanner;

public class exo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("donner des numeros");
		 int n = sc.nextInt();
		 String s = String.valueOf(n);
		 for (int i = 0; i < s.length(); i++) {
			 System.out.println(s.charAt(i));
		}
		
		 
	}

}
