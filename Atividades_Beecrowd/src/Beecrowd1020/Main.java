package Beecrowd1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int D, ano, mes, dia, restoano, restomes;
		
		D = sc.nextInt();
		
		ano = D/365;
		restoano = D%365;
		
		mes = restoano/30;
		restomes=restoano%30;
		
		dia = restomes/1;
		
		System.out.println(ano+" ano(s)");
		System.out.println(mes+" mes(es)");
		System.out.println(dia+" dia(s)");
		
		
		sc.close();

	}

}