package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "9913131");
		
		cookies.remove("email");
		cookies.put("phone", "121231");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
	}

}
