package application;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato para duas casas decimais

        System.out.println("Digite seu peso:");
        double peso = sc.nextDouble();

        System.out.println("Digite sua altura (em metros ou cm):");
        double alturaMetros = lerAltura(sc);

        double imc = peso / (alturaMetros * alturaMetros);

        System.out.println("Seu IMC é: " + df.format(imc)); // Formata o IMC antes de imprimir

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade grau 3");
        }

        sc.close();
    }

    private static double lerAltura(Scanner scanner) {
        while (true) {
            System.out.println("Utilize '.' ou ',' para separar a parte decimal:");
            String input = scanner.next();
            try {
                return Double.parseDouble(input.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido para a altura.");
            }
        }
    }
}
