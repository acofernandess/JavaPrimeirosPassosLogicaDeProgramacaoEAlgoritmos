package Beecrowd1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		
		
		 
		int A,cem,cinquenta,vinte,dez,cinco,dois,um,resto100,resto50,resto20,resto10,resto5,resto2;
		
		A = sc.nextInt();
		
		cem = A/100;
		resto100 = A%100;
		
		cinquenta = resto100/50;
		resto50 = resto100%50;
		
		vinte = resto50/20;
		resto20 = resto50%20;
		
		dez = resto20/10;
		resto10 = resto50%10;
		
		cinco = resto10/5;
		resto5 = resto50%5;
		
		dois = resto5/2;
		resto2 = resto5%2;
		
		um =resto2/1;
		
		System.out.println(A);	
		System.out.println(cem+" nota(s) de R$ 100,00");
		System.out.println(cinquenta+" nota(s) de R$ 50,00");
		System.out.println(vinte+" nota(s) de R$ 20,00");
		System.out.println(dez+" nota(s) de R$ 10,00");
		System.out.println(cinco+" nota(s) de R$ 5,00");
		System.out.println(dois+" nota(s) de R$ 2,00");
		System.out.println(um+" nota(s) de R$ 1,00");
		
		
		sc.close();

	}

}
