package Beecrowd1010;

import java.util.Scanner;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int cp1,cp2,qp1,qp2;
		
		double vp1,vp2,vt,v1,v2;
		
		
		
		
		Scanner sc = new Scanner(System.in);
		cp1 = sc.nextInt();
		qp1 = sc.nextInt();
		vp1 = sc.nextDouble();
		v1=qp1*vp1;
		
		
		cp1 = sc.nextInt();
		qp2 = sc.nextInt();
		vp2 = sc.nextDouble();
		v2=qp2*vp2;
		
		vt = (v1+v2);
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",vt);
		
		sc.close();
	}

}