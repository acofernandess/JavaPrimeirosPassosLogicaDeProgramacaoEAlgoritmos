package Beecrowd1002;


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
		
		triangulo = (A*C)/2;
		circulo = 3.14159* (C*C);
		trapezio = ((A+B)*C)/2;
		quadrado = B*B;
		retangulo = A*B;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}