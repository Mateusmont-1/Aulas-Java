package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0;
		
		for(int i=0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i=0; i < vetor.length; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.2f%n", vetor[i]);
			}
		}
		sc.close();
	}

}
