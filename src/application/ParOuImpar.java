package application;
import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int valor = sc.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println(valor +"é par.");
		} else {
			System.out.println(valor + "é impar.");
		}
		
		if (valor > 0) {
			System.out.println (valor + "é positivo.");
		} else if (valor < 0) {
			System.out.println (valor + "é negativo.");
		}
		else {
			System.out.println (valor + "é zero.");
		}
		
		sc.close();
	}
}