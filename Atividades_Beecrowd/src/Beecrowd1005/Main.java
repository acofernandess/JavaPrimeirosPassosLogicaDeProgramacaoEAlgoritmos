package Beecrowd1005;


import java.util.Locale;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,PA,PB,M;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		PA = A*3.5;
		PB = B*7.5;
		
		M = (PA+PB)/11;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("MEDIA = %.5f%n",M);
		
		
		
		
		
		
		
		

		
		sc.close();
	}
