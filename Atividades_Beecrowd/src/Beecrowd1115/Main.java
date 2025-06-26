package Beecrowd1115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x = sc.nextDouble();
		
		double y = sc.nextDouble();
	
			
			while (x!=0 && y!=0 ) {
				
				if (y>0 && x>0) {
					System.out.println("primeiro");
					
				}else if (y>0 && x<0) {
					System.out.println("segundo");
				}else if (y<0 && x<0) {
					System.out.println("terceiro");
				}else if (y<0 && x>0) {
					System.out.println("quarto");
				}
				
				 x = sc.nextDouble();
				
				 y = sc.nextDouble();
			}
		
		
		
		sc.close();

	}

}