package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		int quantidade_pares=0;
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt(); 
		}
		System.out.println();
		System.out.println("NUMEROS PARES:");
		
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i]%2 == 0) {
				quantidade_pares += 1;
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidade_pares);
		sc.close();
	}

}
