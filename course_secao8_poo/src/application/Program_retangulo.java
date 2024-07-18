package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program_retangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.println("Entre com os dados do Retangulo (altura e largura):");
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Area: " + retangulo.Area());
		System.out.println("Perimetro: " + retangulo.Perimetro());
		System.out.println("Diagonal: " + retangulo.Diagonal());
		
		
		sc.close();
	}

}
