package Beecrowd1051;


import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
			float salario,calcf;
			
			salario =sc.nextFloat();
			
			
			
		
				
			
			
			if (salario >= 0 && salario <= 2000.00) {
				
				System.out.println("Isento");
				
			} else if (salario >= 2000.01 && salario <= 3000.00) {
				
					float calc1=salario-2000;
					float calc2=calc1/100;
				
					
					calcf = calc2 *8;
					System.out.printf("R$ %.2f%n",calcf);
					
			}else if (salario>=3000.01 && salario <=4500.00) {
					
					float calc3=salario-3000;
					float calc4=calc3/100;
					float calc5 = calc4*18; //
					float calc6 = 3000-2000;
					float calc7 = calc6/100;
					float calc8 = calc7*8; //
					
					 calcf =calc5+calc8;
					
					System.out.printf("R$ %.2f%n",calcf);
					
					
					
					
					
				
			}else if (salario > 4500.00) {
				
				float calc9 = salario-4500;
				float calc10 = calc9/100;
				float calc11 = calc10*28; // 
				float calc12=4500-3000;
				float calc13=calc12/100;
				float calc14 = calc13*18; //
				float calc15 = 3000-2000;
				float calc16 = calc15/100;
				float calc17 = calc16*8; //
				
				calcf= calc11+calc14+calc17;
				System.out.printf("R$ %.2f%n",calcf);
				
				
			}
			
		sc.close();
		
		
		
	}

}

