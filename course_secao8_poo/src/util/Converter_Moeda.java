package util;

public class Converter_Moeda {
	public static final double IOF = 6;
	
	public static double converter(double valor_dolar, double quantidade_dolar) {
		double valor = valor_dolar * quantidade_dolar;
		return valor += valor * IOF / 100;
	}
}
