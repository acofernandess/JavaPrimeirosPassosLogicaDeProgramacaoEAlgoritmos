package Beecrowd1038;


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int entrada,quantidade;
		
		double i1 = 4.00;
		double i2 = 4.50;
		double i3 = 5.00;
		double i4 = 2.00;
		double i5 = 1.50;
				
		
		entrada=sc.nextInt();
		quantidade=sc.nextInt();
		
		Locale.setDefault(Locale.US);
		
		if (entrada == 1) {
			double calc = quantidade*i1;
			System.out.printf("Total: R$ %.2f%n",calc);
			
		}else if (entrada == 2) {
			double calc = quantidade*i2;
			System.out.printf("Total: R$ %.2f%n",calc);
			
		}else if (entrada == 3) {
			double calc = quantidade*i3;
			System.out.printf("Total: R$ %.2f%n",calc);
			
		}else if (entrada == 4) {
			double calc = quantidade*i4;
			System.out.printf("Total: R$ %.2f%n",calc);
			
		}else if (entrada == 5) {
			double calc = quantidade*i5;
			System.out.printf("Total: R$ %.2f%n",calc);
			
		}
		
	
		sc.close();
		
		
		
		
		
		

	}

}
