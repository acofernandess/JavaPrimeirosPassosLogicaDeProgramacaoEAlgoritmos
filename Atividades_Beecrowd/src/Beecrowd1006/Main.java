package Beecrowd1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double A,B,C,PA,PB,PC,M;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		PA = A*2;
		PB = B*3;
		PC = C*5;
		
		M = (PA+PB+PC)/10;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("MEDIA = %.1f%n",M);
		
		
		
		
		
		
		
		

		
		sc.close();

	}

}
