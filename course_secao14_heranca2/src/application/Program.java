package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Product #%d data:%n", i+1);
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			if(typeProduct == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if (typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String strDate = sc.nextLine();
				try {
                    Date manufactureDate = sdf.parse(strDate);
                    list.add(new UsedProduct(name, price, manufactureDate));
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Please enter the date in the format DD/MM/YYYY.");
                }
			}
			else {
				list.add(new Product(name, price));
			}
		}
		
		System.out.println();
		for (Product product : list) {
            System.out.println(product.priceTag());
        }
		sc.close();
	}

}
