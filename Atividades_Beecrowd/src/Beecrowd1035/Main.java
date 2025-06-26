package Beecrowd1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		int somaCD = C+D;
		int somaAB =A+B;
		int parA= A%2;
		
		
		
		if (B>C && D>A && somaCD>somaAB && C>0&& D>0 && parA != 1) {
			
			System.out.println("Valores aceitos");
			
		}else {
			
			System.out.println("Valores não aceitos");
			
		}
		
		

	}

}

