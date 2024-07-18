package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		boolean validDate = false;
		Date birthDate = null;
        while (!validDate) {
			System.out.print("Birth date (DD/MM/YYYY): ");
			String dateStr = sc.nextLine();
			try {
				birthDate = sdf.parse(dateStr);
				validDate = true;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Date incorrect format!");
			}
        }
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter Order Data:");
        
        
        OrderStatus orderStatus = null;
        boolean validStatus = false;

        while (!validStatus) {
        	System.out.print("Status: ");
            try {
                orderStatus = OrderStatus.valueOf(sc.nextLine().toUpperCase());
                validStatus = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid status. Available status: PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED. Please try again.");
            }
        }
        
        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, orderStatus, client);
        
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<n; i++) {
        	System.out.printf("Enter #%d item data:%n", i + 1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        	
        }
        
        System.out.println();
        System.out.println(order);
        
		sc.close();
	}

}
