package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program_banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o numero da conta: ");
		int numero_conta = sc.nextInt();
		sc.nextLine();
		System.out.print("Entre com o nome da conta: ");
		String name = sc.nextLine();
		
		System.out.print("Ira realizar deposito inicial (s/n)? ");
		char confirma_deposito = sc.next().charAt(0);
		
		Banco cliente;
		
		if(confirma_deposito == 's' || confirma_deposito == 'S') {
			System.out.print("Informe seu deposito inicial: ");
			double deposito = sc.nextDouble();
			cliente = new Banco(numero_conta, name, deposito);
		}
		else {
			cliente = new Banco(numero_conta, name);
		}
		
		System.out.println("Dados da conta:");
		System.out.println(cliente);
		
		System.out.print("Informe o valor de deposito: ");
		cliente.Deposito(sc.nextDouble());
		
		System.out.println("Dados da conta atualizado:");
		System.out.println(cliente);
		
		System.out.print("Informe o valor de saque: ");
		cliente.Saque(sc.nextDouble());
		
		System.out.println("Dados da conta atualizado:");
		System.out.println(cliente);
		
		sc.close();
	}
}
