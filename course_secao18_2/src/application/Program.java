package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Entre com os dados do contrato:");
			System.out.print("Numero: ");
			Integer numberContract = sc.nextInt();
			sc.nextLine();
			System.out.print("Data (dd/MM/yyyy): ");
			Date dateContract = sdf.parse(sc.nextLine());
			System.out.print("Valor do contrato: ");
			Double priceContract = sc.nextDouble();
			
			Contract contract = new Contract(numberContract, dateContract, priceContract);
			
			System.out.print("Entre com o numero de parcelas: ");
			Integer mounth = sc.nextInt();
			
			ContractService contractService = new ContractService(new PaypalService());
			
			contractService.processContract(contract, mounth);
			
			System.out.println("Parcelas: ");
			
			for(Installment it : contract.getInstallments()) {
				System.out.println(it);
			}
		}
		catch(ParseException e) {
			System.out.println("Data no formato incorreto");
		}
		finally {
            sc.close();
        }
	}
}
