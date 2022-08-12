package exercicio1;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int valor1 = entrada.nextInt();

		System.out.println("Digite o segundo número: ");
		int valor2 = entrada.nextInt();

		System.out.println("Qual operação deseja fazer? a) + b) - c) * ou d)/ ?");
		String operacao = entrada.next();

		switch (operacao) {
		case "a":
			int soma = somar(valor1, valor2);
			System.out.println("A soma dos numéros: " + soma);
			break;
		case "b":
			int subtrair = subtracao(valor1, valor2);
			System.out.println("A subtração dos numéros: " + subtrair);
			break;
		case "c":
			int multiplicar = multiplicacao(valor1, valor2);
			System.out.println("A multiplicação é: " + multiplicar);
			break;
		case "d":
			double dividir = divisao(valor1, valor2);
			System.out.println("Adivisão é: " + dividir);
			break;
		default:
			System.out.println("escolha uma opção válida");
			break;
		}
		entrada.close();

	}

	static int somar(int x, int y) {
		return x + y;
	}

	static int subtracao(int x, int y) {
		return x - y;

	}

	static int multiplicacao(int x, int y) {
		return x * y;

	}

	static double divisao(double x, double y) {
		return x / y;

	}
}