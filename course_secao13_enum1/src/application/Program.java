package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String name_department = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String name_worker = sc.nextLine();
		
		WorkerLevel level_worker = null;
        boolean validLevel = false;

        while (!validLevel) {
            System.out.print("Level: ");
            try {
                level_worker = WorkerLevel.valueOf(sc.nextLine().toUpperCase());
                validLevel = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid level. Available levels: JUNIOR, MID_LEVEL, SENIOR. Please try again.");
            }
        }
        
        System.out.print("Base salary: ");
        double base_salary = sc.nextDouble();
        
        Department department = new Department(name_department);
        Worker worker = new Worker(name_worker, level_worker, base_salary, department);
        
        System.out.print("How mani contracts to this worker? ");
        int n_contracts = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n_contracts; i++) {
        	System.out.printf("Enter contract #%d data: ", i+1);
        	System.out.print("Date (DD/MM/YYYY): ");
            String dateStr = sc.nextLine();
            Date date_contract = null;
            try {
                date_contract = sdf.parse(dateStr);
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please use DD/MM/YYYY.");
                i--; // Decrement i to repeat this iteration
                continue;
            }
        	System.out.print("Value per hour: ");
        	double valuePerHour = sc.nextDouble();
        	System.out.print("Duration (hours): ");
        	int hours = sc.nextInt();
        	sc.nextLine();
        	HourContract contract = new HourContract(date_contract, valuePerHour, hours);
        	worker.AddContract(contract);
        }
        
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dateStr = sc.nextLine();
        String[] dateParts = dateStr.split("/");
        int month = Integer.parseInt(dateParts[0]);
        int year = Integer.parseInt(dateParts[1]);
        
        double income = worker.income(year, month);
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.printf("Income for %02d/%d: %.2f%n", month, year, income);
       
		sc.close();
	}

}
