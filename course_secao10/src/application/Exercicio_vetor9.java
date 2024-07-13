package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String[] vetor_nome = new String[n];
		int[] vetor_idade = new int[n];
		
		for(int i=0; i < vetor_nome.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			vetor_nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetor_idade[i] = sc.nextInt();
		}
		
		int posicao_vetor = 0;
		int maior_idade = 0;
		
		for(int i=0; i < vetor_nome.length; i++) {
			if(vetor_idade[i] > maior_idade) {
				maior_idade = vetor_idade[i];
				posicao_vetor = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetor_nome[posicao_vetor]);
		
		sc.close();
	}

}
