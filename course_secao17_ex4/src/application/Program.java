package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\teste\\out.txt";
		
		// caso queira que ele acrescente no arquivo ao inves de gerar um novo
		// adicionar um "true" depois de referencia o caminho do arquivo em "path"
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
	
