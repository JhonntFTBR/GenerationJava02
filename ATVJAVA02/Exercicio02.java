package ATVJAVA02;

import java.util.Scanner;

public class Exercicio02 {
	
	//2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {
		
		
		double numero;
		int contadorPar=0, contadorImpar=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Digite um n�mero: ");
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
		System.out.println("\nQuantidade de n�meros pares: "+contadorPar+
				"\nQuantidade de n�meros �mpares: "+contadorImpar);
		
		leitor.close();
	}

}