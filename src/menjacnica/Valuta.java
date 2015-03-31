package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv, skraceniNaziv;
	private double prodajni, kupovni;
	private double srednji = (prodajni + kupovni) / 2;
	private GregorianCalendar datumKursa;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	
	public double getProdajni() {
		return prodajni;
	}
	
	public void setProdajni(double prodajni) {
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	
	public void setKupovni(double kupovni) {
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	
	public void setSrednji(double srednji) {
		this.srednji = srednji;
	}
	
	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}
	
	public void setDatumValute(GregorianCalendar datumKursa) {
		this.datumKursa = datumKursa;
	}
}
