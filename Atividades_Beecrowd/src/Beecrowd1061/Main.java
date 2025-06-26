package Beecrowd1061;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		
		
		int W,X,Y,Z,w1,x1,y1,z1,w2,x2,y2,z2,segdia1,segdia2,seghora1,seghora2,segmin1,segmin2,inicio, fim, duraçao,restow,restox,restoy;
		String s ;
		
		
		//s = sc.next();
		w1= sc.nextInt();
		x1= sc.nextInt();
		//s = sc.next();
		y1= sc.nextInt();
		//s = sc.next();
		z1= sc.nextInt();
		
		w2= sc.nextInt();
		x2= sc.nextInt();
		//s = sc.next();
		y2= sc.nextInt();
		//s = sc.next();
		z2= sc.nextInt();
		
		segdia1 = w1*24*60*60;
		segdia2 = w2*24*60*60;
		
		seghora1=x1*60*60;
		seghora2=x2*60*60;
		
		segmin1=y1*60;
		segmin2=y2*60;
		
		inicio = segdia1+seghora1+segmin1+z1;
		fim = segdia2+seghora2+segmin2+z2;
		
		duraçao = fim-inicio;
		
		W=duraçao/86400;
		restow=duraçao%86400;
		
		X=restow/3600;
		restox=restow%3600;
		
		Y=restox/60;
		restoy=restox%60;
		
		Z=restoy/1;
		
		System.out.println(W+" dia(s)");
		System.out.println(X+" hora(s)");
		System.out.println(Y+" minuto(s)");
		System.out.println(Z+" segundo(s)");
		
	
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}