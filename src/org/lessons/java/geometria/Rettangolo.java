package org.lessons.java.geometria;

public class Rettangolo {

	private int base, altezza;

	public Rettangolo() {
		base = altezza = 0;
	}

	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public int getAltezza() {
		return altezza;
	}

	public int calcolaArea() {
		return base * altezza;
	}

	public int calcolaPerimetro() {
		return base * 2 + altezza * 2;
	}

	public String disegna() {
		String s = "";

		s += aggiungiRiga(base);
		s += aggiungiColonne(altezza, base);
		s += aggiungiRiga(base);

		return s;
	}

	private String aggiungiRiga(int l) {
		String s = "";

		for (int i = 0; i < l; i++) {
			s += "*";

			if (i + 1 < l)
				s += " ";
		}

		return s + "\n";
	}

	private String aggiungiColonne(int h, int l) {
		String s = "";

		for (int i = 0; i < h - 2; i++) {
			s += "*";

			for (int j = 0; j < l - 2; j++)
				s += "  ";

			s += " *\n";
		}

		return s;
	}
}
