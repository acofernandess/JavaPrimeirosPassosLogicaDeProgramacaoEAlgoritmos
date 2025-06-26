package Beecrowd1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int a,b,c;
		double MaiorAB;
		
		a = sc.nextInt();	
		b = sc.nextInt();	
		c = sc.nextInt();	
		
		MaiorAB = (a+b+Math.abs(a-b))/2;
		
		
		
		Locale.setDefault(Locale.US);
		
		if (MaiorAB > c) {
			System.out.printf("%.0f eh o maior",MaiorAB);
			
		} else {
			
			System.out.println(c+" eh o maior");
		
		};
		
		
		
		sc.close();

	}

}


