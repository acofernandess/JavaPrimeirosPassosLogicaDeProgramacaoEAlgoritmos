package Beecrowd1134;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void  main (String[]args){
		
		
		
		Scanner sc = new Scanner (System.in);
		
			double nota1= sc.nextDouble();
			double nota2= sc.nextDouble();
			
			while (nota1 < 0 || nota1 > 10) {
				
				System.out.println("nota invalida");
				
				 nota1= sc.nextDouble();
				}
			
			while (nota2 <0 || nota2 > 10) {
				
				System.out.println("nota invalida");
				nota2= sc.nextDouble();
			
			}
			
				double calc1 = nota1+nota2;
				double media = calc1/2;
				
				
				
				System.out.printf("media = %.2f%n",media);
			
			
		
		sc.close();
		
	}

}