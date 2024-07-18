package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double maior_numero = 0.0;
		int posicao_maior = 0;
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i] > maior_numero) {
				maior_numero = vetor[i];
				posicao_maior = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior_numero);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao_maior);
		
		sc.close();
	}

}
