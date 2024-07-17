package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.Person;
import entities.PhisicalPerson;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the numer of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Tax payer #%d data:%n", i+1);
			System.out.print("Individual or company (i/c)? ");
			char typePerson = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			sc.nextLine();
			if(typePerson == 'i') {
				System.out.print("Health expenditures: ");
				Double spentHealth = sc.nextDouble();
				sc.nextLine();
				list.add(new PhisicalPerson(name, anualIncome, spentHealth));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberEmployees = sc.nextInt();
				sc.nextLine();
				list.add(new LegalPerson(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for(Person person : list) {
			sum += person.incomeTax();
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.incomeTax()));
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		
		sc.close();
	}

}
