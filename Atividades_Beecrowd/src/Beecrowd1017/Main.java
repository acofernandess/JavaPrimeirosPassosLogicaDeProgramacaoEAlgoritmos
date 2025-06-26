package Beecrowd1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vkmh,th,consumo;
		double calc1,calc2;
		
		consumo = 12;//kml
		
		th = sc.nextInt();
		vkmh = sc.nextInt();
		
		calc1 = th*vkmh; //tempo de viagem * multiplicado pela velocidade media
						// aqui encontramos a distancia percorrida
		
		calc2 = calc1/consumo;// com a distancia percorrida, calculamos o consumo
							// de combustivel durante esta distancia
		

		
		Locale.setDefault(Locale.US);
		
				System.out.printf("%.3f%n",calc2);
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
	}

}