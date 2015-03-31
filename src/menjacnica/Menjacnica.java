package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta kurs) {
			if (kurs == null)
				throw new RuntimeException("Kurs ne sme biti null");
			
			if (valute.contains(kurs))
				throw new RuntimeException("Taj kurs je vec unet");
			
			valute.add(kurs);
	}

	public void izbrisiKurs(Valuta kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme biti null");
		
		if (!valute.contains(kurs))
			throw new RuntimeException("Taj kurs ne postoji");
		
		valute.remove(kurs);
	}

	public LinkedList<Valuta> pronadjiKurs(String valuta, GregorianCalendar datum) {
		LinkedList<Valuta> rezultat = new LinkedList<Valuta>();
		
		if (valuta == null && datum == null)
			// ako ne unesu nijedan podatak bacamo izuzetak
			throw new RuntimeException("Morate uneti barem jedan od trazenih podataka");
		
		if (valuta == null) {
			// vracamo sve kurseve na uneti datum
			for (int i = 0; i <= valute.size(); i++) {
				if (valute.get(i).getDatumKursa().equals(datum)) 
					rezultat.add(valute.get(i));
			}
		}
		
		if (datum == null) {
			// vracamo sve kurseve sa unetim nazivom
			for (int i = 0; i <= valute.size(); i++) {
				// za slucaj da su umesto punog naziva uneli skraceni naziv valute
				if (valute.get(i).getNaziv().equals(valuta) || valute.get(i).getSkraceniNaziv().equals(valuta)) 
					rezultat.add(valute.get(i));
			}
		}
		
		if (valuta != null && datum != null) {
			for (int i = 0; i < valute.size(); i++) {
				if ( (valute.get(i).getNaziv().equals(valuta) || valute.get(i).getSkraceniNaziv().equals(valuta)) 
						&& valute.get(i).getDatumKursa().equals(datum)) {
					rezultat.add(valute.get(i));
					break;
				}
			}
		}
		
		return rezultat;
	}

}
