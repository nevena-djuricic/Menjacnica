package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta kurs) {
		if (kurs == null) {
			System.out.println("Greska! Kurs ne sme biti null");
			return;
		}

		if (valute.contains(kurs)) {
			System.out.println("Greska! Taj kurs vec postoji");
			return;
		}
		
		valute.add(kurs);
	}

	public void izbrisiKurs(Valuta kurs) {
		// TODO Auto-generated method stub

	}

	public LinkedList<Valuta> pronadjiKurs(String valuta,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
