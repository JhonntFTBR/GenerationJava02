package ATVJAVA02;

import java.util.Scanner;

public class Exercicio03 {
	
	//3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.

	public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
		
		int idade=0,menor21=0,maior50=0;
		
		while(idade!=-99) {
			
			
			System.out.println("Digite a idade: (OBS: caso queira finaliza digite -99) ");
			idade = leia.nextInt();
			if(idade<21 && idade>0) {
				menor21++;
								
			}else if(idade>50) {
				maior50++;
				
			}
			
				
			
		}
		   leia.close();	
		   System.out.println("Há "+menor21+" pessoas com menos de 21 anos e "+maior50+ " pessoas com pais de 50 anos");
		

	}

}