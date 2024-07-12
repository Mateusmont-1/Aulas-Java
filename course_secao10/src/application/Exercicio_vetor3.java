package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Exercicio_vetor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		Pessoa[] vetor = new Pessoa[n];
		
		for(int i=0; i<vetor.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		double soma_altura = 0.0;
		double menor = 0.0;
		
		for(int i=0; i<vetor.length; i++) {
			soma_altura += vetor[i].getIdade();
			if(vetor[i].getIdade() < 16) {
				menor += 1;
			}
		}
		
		double media_altura = soma_altura / vetor.length;
		System.out.printf("Altura média : %.2f%n", media_altura);
		double porcentagem_menor = menor / vetor.length * 100.0;
		System.out.printf("Pessoas com menos de 16 anos : %.2f%%n", porcentagem_menor);
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				vetor[i].getNome();
			}
		}
		sc.close();
	}

}
