package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Exercicio_lista_funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.printf("Emplyoee #%d:%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Funcionario(id,name,salary));
			sc.nextLine();
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_search = sc.nextInt();
		
		for(Funcionario employees : list) {
			if(employees.getId() == id_search) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				employees.increaseSalary(percentage);
			}
		}
		
		System.out.println();
		for(Funcionario employees : list) {
			System.out.println(employees);
		}
		
		sc.close();
		
	}

}
