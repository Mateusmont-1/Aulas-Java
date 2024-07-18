package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		int soma_pares = 0;
		int quantidade_par = 0;
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				soma_pares += vetor[i];
				quantidade_par += 1;
			}
		}
		
		if(soma_pares != 0.0) {
			double media = soma_pares / quantidade_par;
			System.out.println("MEDIA DOS PARES = " + media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();
	}

}
