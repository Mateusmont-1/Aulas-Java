package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Voting;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file ful path: ");
		String path = sc.nextLine();
		Map<Voting, Integer> voting = new LinkedHashMap<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int votingComputed = Integer.parseInt(fields[1]);
				Voting vt = new Voting(name);
				if(!voting.containsKey(vt)) {
					voting.put(vt, votingComputed);
				}
				else {
					int voteStored = voting.get(vt);
					voteStored += votingComputed;
					voting.put(vt, voteStored);
				}
				line = br.readLine();
			}
			for(Voting vt : voting.keySet()) {
				System.out.println(vt.getName() + ": " + voting.get(vt));
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
