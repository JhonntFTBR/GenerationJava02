package ATVJAVA02;

import java.util.Scanner;

public class Exercicio02 {
	
	//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args) {
		
		
		double numero;
		int contadorPar=0, contadorImpar=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Digite um número: ");
			numero = leitor.nextDouble();
			
			if(numero % 2 == 0)
			{
				contadorPar++;
			}
			else
			{
				contadorImpar++;
			}
		}
		System.out.println("\nQuantidade de números pares: "+contadorPar+
				"\nQuantidade de números ímpares: "+contadorImpar);
		
		leitor.close();
	}

}