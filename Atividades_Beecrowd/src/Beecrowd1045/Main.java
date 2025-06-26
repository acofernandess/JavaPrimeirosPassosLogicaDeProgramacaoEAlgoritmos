package Beecrowd1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double temp;
		
		if (b>a) {
			temp = a;
			a = b;
			b = temp;
		}
		if (c>a) {
			temp=a;
			a=c;
			c=temp;
			
		}
		if (c>b) {
			temp = b;
			b=c;
			c=temp;
			
		}
		
		if (a>=b+c) {
			
			System.out.println("NAO FORMA TRIANGULO");
			
		}else if (a*a==b*b+c*c) {
			System.out.println("TRIANGULO RETANGULO");
			
			
		}else if (a*a>(b*b)+(c*c)) {
			
			 if (a==b && b==c) {
				 System.out.println("TRIANGULO OBTUSANGULO");
					System.out.println("TRIANGULO EQUILATERO");
					
				}else if (a==b || b==c) {
					System.out.println("TRIANGULO OBTUSANGULO");
					System.out.println("TRIANGULO ISOSCELES");
				}else {System.out.println("TRIANGULO OBTUSANGULO");
				}
			
		}else if (a*a<(b*b)+(c*c)) {
			
			if (a==b && b==c) {
				System.out.println("TRIANGULO ACUTANGULO");
				System.out.println("TRIANGULO EQUILATERO");
				
			}else if (a==b || b==c) {
				System.out.println("TRIANGULO ACUTANGULO");
				System.out.println("TRIANGULO ISOSCELES");
			}else {System.out.println("TRIANGULO ACUTANGULO");
			}
			
		}else if (a==b && b==c) {
			System.out.println("TRIANGULO EQUILATERO");
			
		}else if (a==b || b==c) {
			System.out.println("TRIANGULO ISOSCELES");
		}
			
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}