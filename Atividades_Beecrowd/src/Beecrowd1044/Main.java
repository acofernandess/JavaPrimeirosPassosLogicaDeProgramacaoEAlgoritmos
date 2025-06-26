package Beecrowd1044;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner (System.in);
		 
		 int A,B;
		 
		 A = sc.nextInt();
		 B = sc.nextInt();
		 
		int calc1 = A%B;
		int calc2 = B%A;
		 
		 
		 if (calc1 == 0 || calc2 == 0) {
			 System.out.println("Sao Multiplos");
			
		} else {
			System.out.println("Nao sao Multiplos");
		}
		 
		 sc.close();
		
		
	}

}

