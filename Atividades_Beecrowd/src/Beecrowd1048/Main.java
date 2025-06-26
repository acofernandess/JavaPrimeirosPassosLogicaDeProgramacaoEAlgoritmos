package Beecrowd1048;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float salario = sc.nextFloat();
		
		float calc100 = salario/100;
		
		float calc15 = calc100*15;
		float calc12 = calc100*12;
		float calc10 = calc100*10;
		float calc7  = calc100*7;
		float calc4  = calc100*4;
		
		Locale.setDefault(Locale.US);
		
		
		if (salario >= 0 && salario <=400.00) {
			float novosalario=salario+calc15;
			float reajuste = novosalario-salario;
			int percentual = 15;
			
			System.out.printf("Novo salario: %.2f%n",novosalario);
			System.out.printf("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: "+percentual+" %");
			
			
			
		}else  if (salario >= 400.01 && salario <=800.00) {
					float novosalario=salario+calc12;
					float reajuste = novosalario-salario;
					int percentual = 12;
					
					System.out.printf("Novo salario: %.2f%n",novosalario);
					System.out.printf("Reajuste ganho: %.2f%n",reajuste);
					System.out.println("Em percentual: "+percentual+" %");
					
			
			
		}else  if (salario >= 800.01 && salario <=1200.00) {
					float novosalario=salario+calc10;
					float reajuste = novosalario-salario;
					int percentual = 10;
					
					System.out.printf("Novo salario: %.2f%n",novosalario);
					System.out.printf("Reajuste ganho: %.2f%n",reajuste);
					System.out.println("Em percentual: "+percentual+" %");
					
			
			
		}else if (salario >= 1200.01 && salario <=2000.00) {
					float novosalario=salario+calc7;
					float reajuste = novosalario-salario;
					int percentual = 7;
					
					System.out.printf("Novo salario: %.2f%n",novosalario);
					System.out.printf("Reajuste ganho: %.2f%n",reajuste);
					System.out.println("Em percentual: "+percentual+" %");
			
			
			
		}else if (salario >2000) {
					float novosalario=salario+calc4;
					float reajuste = novosalario-salario;
					int percentual = 4;
					
					System.out.printf("Novo salario: %.2f%n",novosalario);
					System.out.printf("Reajuste ganho: %.2f%n",reajuste);
					System.out.println("Em percentual: "+percentual+" %");
			
			
			
		}
		
			
			
			
		
		sc.close();

	}

}

