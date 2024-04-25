package application;

import java.util.Scanner;

public class SomaEComparacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite o valor de A:");
		int a = sc.nextInt();
		
		System.out.println ("Digite o valor de B:");
		int b = sc.nextInt();
		
		System.out.println ("Digite o valor de C:");
		int c = sc.nextInt();
		
		int soma = a + b;
		
		if (soma < c) {
			System.out.println("A soma de A e B é menor que C.");
		} else {
			System.out.println("A soma de A e B não é menor que C.");
		}
		
		sc.close();
	}
}