package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String strPath = "c:\\teste\\dados.csv";
		File path = new File(strPath);
		@SuppressWarnings("unused")
		boolean success = new File(path.getParent() + "\\out").mkdir();
		String path_out = "c:\\teste\\out\\summary.csv";
		
		List<Product> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            String line = br.readLine();
            while (line != null) {
                String[] partes = line.replace("\"", "").split(",");

                if (partes.length >= 3) {
                    String name = partes[0];
                    double price = Double.parseDouble(partes[1]);
                    int quantity = Integer.parseInt(partes[2]);
                    products.add(new Product(name, price, quantity));
                } 
                else {
                    System.out.println("Linha com formato incorreto: " + line);
                }
                
                line = br.readLine();
            }
        }
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path_out))){
			for(Product product : products) {
				bw.write(product.toString());
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}
}
	
