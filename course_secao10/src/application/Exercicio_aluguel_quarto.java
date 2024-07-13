package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto_aluguel;

public class Exercicio_aluguel_quarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto_aluguel[] vetor_quartos = new Quarto_aluguel[10];
		
		System.out.print("Quantos quartor sera alugado? ");
		int n = sc.nextInt();
		
		for(int i=0; i < n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Número do quarto: ");
            int quarto = sc.nextInt();
            
            if (quarto >= 0 && quarto < 10) {
                vetor_quartos[quarto] = new Quarto_aluguel(nome, email, true, quarto);
            } else {
                System.out.println("Número do quarto inválido. Deve estar entre 0 e 9.");
            }        
        }
		
		System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i = 0; i < 10; i++) {
            if (vetor_quartos[i] != null) {
                System.out.println("Quarto " + i + ": " + vetor_quartos[i].getName() + ", " + vetor_quartos[i].getEmail());
            }
        }
		
		sc.close();
	}

}
