package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program_static1 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre raio: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circuferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", Calculator.PI);
		sc.close();
	}
}
