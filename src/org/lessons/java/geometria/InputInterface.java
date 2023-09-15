package org.lessons.java.geometria;

import java.util.Scanner;

public class InputInterface {

	public static int getInt(Scanner scanner, int min, int max, String requestMessage) {

		String inputValue;
		int x = 0;
		boolean inputSuccess = false;

		System.out.println(requestMessage);

		while (!inputSuccess) {
			inputValue = scanner.nextLine();
			try {
				x = Integer.parseInt(inputValue);

				if (x < min)
					System.out.println("Errore! Devi inserire un numero maggiore di " + (min - 1) + ". Riprova");
				else if (x > max)
					System.out.println("Errore! Devi inserire un numero minore di  " + (max + 1) + ". Riprova");
				else
					inputSuccess = true;
			} catch (NumberFormatException e) {
				System.out.println("Errore! Devi inserire un numero intero. Riprova");
			}
		}

		return x;
	}
}
