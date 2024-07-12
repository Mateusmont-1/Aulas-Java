package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		System.out.printf("VALORES =");
		for(int i=0; i<vetor.length; i++) {
			soma += vetor[i];
			System.out.print(" " + vetor[i]);
		}
		System.out.println();
		System.out.println("SOMA = " + soma);
		double avg = soma / vetor.length;
		System.out.println("MEDIA = " + avg);
		
		sc.close();
	}

}
