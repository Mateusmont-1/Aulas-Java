package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client c1 = new Client("Maria", "maria@");
		Client c2 = new Client("Maria", "rob@");
		Client c3 = new Client("Maria", "maria@");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
 		
	}

}
