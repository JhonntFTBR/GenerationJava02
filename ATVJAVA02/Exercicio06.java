package ATVJAVA02;

import java.util.Scanner;

public class Exercicio06 {
	
	//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)

	public static void main(String[] args) {
		float numero, somaMultiplos = 0, count = 0, media = 0;

		Scanner leitor = new Scanner(System.in);

		System.out.println("***** PARA FINALIZAR A EXECU��O DO PROGRAMA DIGITE 0 *****");
		do {
			System.out.println("Digite um numero: ");
			numero = leitor.nextInt();

			if (numero != 0) {
				if (numero % 3 == 0) {
					count++;
					somaMultiplos = somaMultiplos + numero;
				}
			}

			media = somaMultiplos / count;
		} while (numero != 0);
		System.out.printf("\nM�DIA DO MULTIPLOS DE 3 = %.2f", media);

		leitor.close();

	}

}