package Beecrowd1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		
	Scanner sc = new Scanner(System.in);
	
	int X;
	double Y,calc;
	
	X = sc.nextInt();
	
	Y = sc.nextDouble();
	
	calc = X/Y;
	
	System.out.printf("%.3f km/l%n",calc);
	
	
	sc.close();

	}

}