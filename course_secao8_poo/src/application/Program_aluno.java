package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program_aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("N1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("N2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("N3: ");
		aluno.n3 = sc.nextDouble();
		
		if(aluno.media() < 60.0) {
			System.out.println("Nota final: " + aluno.media());
			System.out.println("Reprovado");
			System.out.println("Faltando " + aluno.pontosFaltando() + " pontos");
		}
		else {
			System.out.println("Nota final: " + aluno.media());
			System.out.println("Aprovado");
		}
		sc.close();
	}

}
