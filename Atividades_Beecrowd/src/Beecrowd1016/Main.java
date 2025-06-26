package Beecrowd1016;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int vx,vy,dkm;
		double calc1;
		
		vx = 60; //kmh
		vy = 90; //kmh
		
		Scanner sc = new Scanner(System.in);
		
		dkm = sc.nextInt();
		
		calc1 = dkm*2;
		
		System.out.printf("%.0f minutos%n",calc1);
		
		
		
		sc.close();		
		

	}

}