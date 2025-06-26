package Beecrowd1021;

import java.util.Locale;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		//double M,MM,cem,cinquenta,vinte,dez,cinco,dois,resto100,resto50,resto20,resto10,resto5,resto2,m1real,m50,m25,m10,m5,m1,restom1real,restom50,restom25,restom10,restom5;
	
		
			Scanner sc = new Scanner (System.in);
			
			double M;
		
			M= sc.nextDouble();
			int mm = (int) Math.round (M*100);
		
			int cem = mm/10000;
			mm %= 10000;
			
			int cinquenta = mm/5000;
			mm %= 5000;
			
			int vinte = mm/2000;
			mm %= 2000;
			
			int dez = mm/1000;
			mm %= 1000;
			
			int cinco = mm/500;
			mm %= 500;
			
			int dois = mm/200;
			mm %= 200;
			
			int m1 = mm/100;
			mm %= 100;
			
			int m50 = mm/50;
			mm %= 50;
			
			int m25 = mm/25;
			mm %= 25;
			
			int m10 = mm/10;
			mm %= 10;
			
			int m5 = mm/5;
			mm %= 5;
			
			int m01 = mm/1;
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("NOTAS:");	
			System.out.println(cem+" nota(s) de R$ 100.00");
			System.out.println(cinquenta+" nota(s) de R$ 50.00");
			System.out.println(vinte+" nota(s) de R$ 20.00");
			System.out.println(dez+" nota(s) de R$ 10.00");
			System.out.println(cinco+" nota(s) de R$ 5.00");
			System.out.println(dois+" nota(s) de R$ 2.00");
			
			System.out.println("MOEDAS:");	
			System.out.println(m1+" moeda(s) de R$ 1.00");
			System.out.println(m50+" moeda(s) de R$ 0.50");
			System.out.println(m25+" moeda(s) de R$ 0.25");
			System.out.println(m10+" moeda(s) de R$ 0.10");
			System.out.println(m5+" moeda(s) de R$ 0.05");
			System.out.println(m01+" moeda(s) de R$ 0.01");
			
			
			
			
			
			
		
		sc.close();

	}

}