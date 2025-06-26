package Beecrowd1047;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int hi = sc.nextInt();
		int mi = sc.nextInt();
		int hf = sc.nextInt();
		int mf = sc.nextInt();
		
	
		
		int calc1 = hi * 60; 
		int calc2 = mi;  
		int inicio = calc1+calc2;
		
		int calc4 = hf * 60; 
		int calc5 = mf ; 
		int fim = calc4+calc5; 
		
		int duracao;
		
		if (inicio<fim) {
			
			 duracao =fim-inicio;
			
		}else {
			  duracao = (24*60 - inicio)+fim;
		}
		
		int duracaohoras = duracao/60;
		
		int duracaominutos = duracao%60;
		
		System.out.println("O JOGO DUROU "+duracaohoras+" HORA(S) E "+duracaominutos+ " MINUTO(S)");
		
		
		
		
		
		
				
		
		sc.close();
		

	}

}
