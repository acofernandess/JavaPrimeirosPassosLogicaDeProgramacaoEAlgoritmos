package Beecrowd1015;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double x1,x2,y1,y2,dist,calc1,calc2;
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();		
		x2 = sc.nextDouble();	
		y2 = sc.nextDouble();
		
		
		calc1 = x2-x1;
		calc2 = y2-y1;
		
		
		
		dist =  Math.sqrt((calc1*calc1)+(calc2*calc2));
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("%.4f%n",dist);
		
		
		
		sc.close();
		

	}

}
