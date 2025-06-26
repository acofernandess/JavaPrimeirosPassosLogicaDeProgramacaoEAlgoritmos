package Beecrowd1007;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int A,B,C,D,DIF;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		DIF=((A*B)-(C*D));
		
		System.out.println("DIFERENCA = "+DIF);
		
		sc.close();

	}

}
