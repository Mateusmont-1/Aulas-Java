package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		String strPath = "c:\\teste\\in.txt";
		File path = new File(strPath);
		
		List<Employee> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
            while (employeeCsv != null) {
            	String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for(Employee emp : list) {
            	System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	
	}
}


