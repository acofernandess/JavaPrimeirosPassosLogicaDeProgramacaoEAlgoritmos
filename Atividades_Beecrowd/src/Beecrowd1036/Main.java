package Beecrowd1036;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		double A,B,C,delta,x1,x2,raizdelta,baoq;
		
		
		A= sc.nextDouble();
		B= sc.nextDouble();
		C= sc.nextDouble();
		
		
		delta = B*B - 4*A*C;
	
		
		Locale.setDefault(Locale.US);
		
		if ((delta < 0) || (A == 0 ) ) {
			System.out.println("Impossivel calcular");
			
		}else  {
			
			raizdelta = Math.sqrt(delta);
			
			
			x1 = (-B+raizdelta)/(2.0*A);
			x2 = (-B-raizdelta)/(2.0*A);
			
				System.out.printf("R1 = %.5f%n",x1);
				System.out.printf("R2 = %.5f%n",x2);
			
		}

		sc.close();

	}

}
