package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		System.out.print("Enter salary: ");
		Double ifSalary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String lines = br.readLine();
			List<Employee> list = new ArrayList<Employee>();
			
			while(lines != null) {
				String[] fields = lines.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				lines = br.readLine();
			}
			
			List<String> emails = list.stream().filter(p -> p.getSalary() > ifSalary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", ifSalary) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream().filter(p -> p.getName().toUpperCase().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary of people whose name Starts with 'M': " + String.format("%.2f", sum));
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
