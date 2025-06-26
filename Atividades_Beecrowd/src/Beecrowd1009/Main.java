package Beecrowd1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		
		double salario,vendas,comissao,calc1,salariototal;
		
		nome = sc.next();
		
		salario = sc.nextDouble();
		
		vendas = sc.nextDouble();
		
		calc1 = vendas/20;
		
		comissao = calc1*3;
		
		salariototal = salario+comissao;
		
		Locale.setDefault(Locale.US);
		System.out.printf("TOTAL = R$ %.2f%n",salariototal);
		
		sc.close();
		
		

	}
