package Beecrowd1046;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		
	 Scanner sc = new Scanner (System.in);
	 
	 int hi = sc.nextInt();
	 int hf = sc.nextInt();
	 
 
	 
	 
	 if (hi<hf) {
		int calcf = hf-hi;
		System.out.println("O JOGO DUROU "+calcf+" HORA(S)");
		
	} else {
			int calc1 = 24 -hi;
		    int calcf = calc1+hf;
		
		System.out.println("O JOGO DUROU "+calcf+" HORA(S)");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 sc.close();
		
		
		
		
		
		
		
		
		
		
	}
}
