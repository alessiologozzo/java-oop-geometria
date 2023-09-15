package org.lessons.java.geometria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Rettangolo> rettangoli = new ArrayList<Rettangolo>();

		int dim = InputInterface.getInt(scanner, 3, 6, "Inserisci il numero dei rettangoli che vuoi inserire");

		for (int i = 0; i < dim; i++) {
			System.out.println(System.lineSeparator());

			rettangoli.add(new Rettangolo());

			rettangoli.get(i)
					.setBase(InputInterface.getInt(scanner, 2, 20, (i + 1) + ") Inserisci la base del rettangolo"));
			rettangoli.get(i).setAltezza(
					InputInterface.getInt(scanner, 2, 20, (i + 1) + ") Inserisci l'altezza del rettangolo"));
		}

		System.out.println(System.lineSeparator());

		for (int i = 0; i < dim; i++)
			System.out.println("RETTANGOLO " + (i + 1) + System.lineSeparator() + "Base: " + rettangoli.get(i).getBase()
					+ System.lineSeparator() + "Altezza: " + rettangoli.get(i).getAltezza() + System.lineSeparator()
					+ "Perimetro: " + rettangoli.get(i).calcolaPerimetro() + System.lineSeparator() + "Area: "
					+ rettangoli.get(i).calcolaArea() + System.lineSeparator() + rettangoli.get(i).disegna());

		System.out.println(System.lineSeparator() + System.lineSeparator() + "Arrivederci!");
	}

}
