package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS:");
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
