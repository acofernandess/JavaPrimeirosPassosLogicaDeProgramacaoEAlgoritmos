package Beecrowd1049;

import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palavraA = sc.next();
		String palavraB = sc.next();
		String palavraC = sc.next();
	
		
		
		
	
		
		
		
		if (palavraA.equals("vertebrado")) {
			
			if (palavraB.equals("ave")) {
				
					if (palavraC.equals("carnivoro")) {
					
						System.out.println("aguia");		
					
					}else if (palavraC.equals("onivoro")) {
					System.out.println("pomba");
					
					}
				
			}else if (palavraB.equals("mamifero")) {
				
					if (palavraC.equals("onivoro")) {
					
						System.out.println("homem");
					
					
					
					}else if (palavraC.equals("herbivoro")) {
					System.out.println("vaca");
					}
				
				
			}
			
		}else if (palavraA.equals("invertebrado")) {
			
			if (palavraB.equals("inseto")) {
				
				if (palavraC.equals("hematofago")) {
					
					System.out.println("pulga");
					
				}else if (palavraC.equals("herbivoro")) {
					
					System.out.println("lagarta");
					
				}
				
			}else if (palavraB.equals("anelideo")) {
				
				if (palavraC.equals("hematofago")) {
					
					System.out.println("sanguessuga");
					
				}else if (palavraC.equals("onivoro")) {
					
					System.out.println("minhoca");
					
				}
				
			}
			
		}
		
		sc.close();
		
		
	}

}
