package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preco: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		int quantity = sc.nextInt();
		
		Product produto = new Product(name, price, quantity);
		System.out.println(produto.getName());
		
		System.out.println("Dados produto: "+ produto);
		
		System.out.println("Informe a quantidade que foi adicionada no estoque: ");
		produto.AddProduto(sc.nextInt());
		
		System.out.println("Dados atualizado: "+ produto);
		
		System.out.println("Informe a quantidade que foi removida no estoque: ");
		produto.RemoverProduto(sc.nextInt());
		
		System.out.println("Dados atualizado: "+ produto);
		
		sc.close();
	}

}