package esercizi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String userString = "";
		
		// Finchè l'utente non digita "stop" continuo a richiedere una stringa e stamparla
		while (!userString.equalsIgnoreCase("stop")) {
			
			// Chiedo e stampo la stringa
			System.out.println("-- DIGITA UNA STRINGA --");
			userString = scanner.nextLine();
			System.out.println("stringa stampata: " + userString);
		}
		
		scanner.close();
		System.out.println("Programma terminato!");
	}

}
