package ATVJAVA02;

import java.util.Scanner;

public class Exercicio05 {
	
	//5 -Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		

		int numero = 0 ;

		int soma = 0;

		do {
        System.out.println("Digite um numero");
        numero = leia.nextInt();
        
		System.out.printf("%d", numero);

		soma += numero;

		}while(numero != 0 );

			System.out.printf("O resultado da Soma é: %d", soma);

	}

	
		
	}



