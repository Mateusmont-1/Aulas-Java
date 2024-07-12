package application;

import java.util.Locale;
import java.util.Scanner;

public class Program_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a quantidade de pessoas: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum/n;
		
		System.out.printf("A media de altura é: %.2f%n", avg);
		
		sc.close();
	}

}
