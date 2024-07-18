package application;

import java.util.Locale;
import java.util.Scanner;

import util.Converter_Moeda;

public class Program_comprar_dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o valor do dolar: ");
		double valor_dolar = sc.nextDouble();
		System.out.print("Quantos dolares você deseja comprar? ");
		double quantidade_dolar = sc.nextDouble();
		
		double valor_reais = Converter_Moeda.converter(valor_dolar, quantidade_dolar);
		
		System.out.printf("Você gastara: R$ %.2f%n", valor_reais);
		
		
		sc.close();
	}

}
