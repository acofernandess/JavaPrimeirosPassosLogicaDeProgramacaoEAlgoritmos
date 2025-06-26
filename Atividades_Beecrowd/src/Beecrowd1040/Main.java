package Beecrowd1040;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner (System.in);
		
			float n1,n2,n3,n4,nr1,nr2,nr3,nr4,media;
			
			n1 = sc.nextFloat();
			
			n2 = sc.nextFloat();
			
			n3 = sc.nextFloat();
			
			n4 = sc.nextFloat();
			
			nr1 = n1*2;
			nr2 = n2*3;
			nr3 = n3*4; 
			nr4 = n4*1;
			
			media = (nr1+nr2+nr3+nr4)/10;
			
			
			System.out.printf("Media: %.1f%n",media);
			
			if (media >= 7.0) {
				System.out.println("Aluno aprovado.");
			}else if (media < 5.0) {
				System.out.println("Aluno reprovado.");
				
				
			}else  {
				
				System.out.println("Aluno em exame.");
				
				float nexame = sc.nextFloat();
				
				System.out.printf("Nota do exame: %.1f%n",nexame);
				
				float media2 = (media+nexame)/2;
				
						if (media2 >= 5.0) {
								System.out.println("Aluno aprovado.");
								System.out.printf("Media final: %.1f%n",media2);
					
						} else {
								System.out.println("Aluno reprovado.");
								System.out.printf("Media final: %.1f%n",media2);
						}
						
						
				
			}
			
			
			
			
			
			
			
		sc.close();
		
		
		
	}

}