package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int[][] mat= new int[M][N];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int number_search = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == number_search) {
					System.out.printf("Position %d,%d%n", i,j);
					if(j>0) {
						System.out.printf("Left: %d%n", mat[i][j-1]);
					}
					if(i>0) {
						System.out.printf("Up: %d%n", mat[i-1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.printf("Right: %d%n", mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.printf("Down: %d%n", mat[i+1][j]);
					}
				}
			}
		}
		
		sc.next();
	}

}
