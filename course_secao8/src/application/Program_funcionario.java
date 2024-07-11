package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Nome:");
		funcionario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Funcionario: " + funcionario);
		
		System.out.print("Informe a porcentagem de aumento salarial: ");
		funcionario.AumentoSalarial(sc.nextDouble());
		
		System.out.println("Atualizado: " + funcionario);
		
		sc.close();

	}

}
