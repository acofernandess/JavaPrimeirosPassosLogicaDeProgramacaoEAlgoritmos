package Beecrowd1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	
		int N, calchora,calcmin,calcseg,hora,min,resto;
		
		hora = 3600; //3600segundos
		min = 60; //60 segunos
		
		N = sc.nextInt();
		
		calchora = N/hora; //N/3600 quantidade de segundos em horas
		resto = N%hora;
		calcmin = resto/min; //quantidade de segundos em minutos
		calcseg = N%60; //quantidade em segundos
				
		System.out.println(calchora+":"+calcmin+":"+calcseg);
		
		
		sc.close();
	}

}
