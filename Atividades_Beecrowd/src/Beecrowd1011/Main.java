package Beecrowd1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double raio,raioaocubo,pi,calc, volume;
		
		
		
		raio = sc.nextDouble();
		
		pi = 3.14159;
		
		raioaocubo = raio*raio*raio;
		
		calc = 4.0/3.0;
		
		volume = calc*pi*raioaocubo;
		
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("VOLUME = %.3f%n",volume);
		
		
		
		
		

		sc.close();
		
		
		
		

	}

}
