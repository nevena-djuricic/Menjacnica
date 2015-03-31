package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;


public interface MenjacnicaInterfejs {

	public void dodajKurs (Valuta kurs);
	
	public void izbrisiKurs (Valuta kurs);
	
	public LinkedList<Valuta> pronadjiKurs (String valuta, GregorianCalendar datum);
	
}
