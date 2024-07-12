package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program_vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos: ");
		int n = sc.nextInt();
		
		Produto[] produtos = new Produto[n];
		
		for(int i=0; i<produtos.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			Double preco = sc.nextDouble();
			produtos[i] = new Produto(nome, preco);
		}
		
		double sum = 0.0;
		
		for(int i=0; i<produtos.length; i++) {
			sum += produtos[i].getPreco();
		}
		
		double avg = sum/produtos.length;
		
		System.out.printf("A media de preço é: %.2f%n", avg);
		
		sc.close();
	}

}
