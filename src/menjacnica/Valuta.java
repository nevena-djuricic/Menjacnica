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
		if (naziv == null)
			throw new RuntimeException("Naziv ne sme biti null");
		this.naziv = naziv;
	}
	
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null)
			throw new RuntimeException("Skraceni naziv ne sme biti null");
		this.skraceniNaziv = skraceniNaziv;
	}
	
	public double getProdajni() {
		return prodajni;
	}
	
	public void setProdajni(double prodajni) {
		if (prodajni < 0)
			throw new RuntimeException("Prodajni kurs ne sme biti negativan broj");
		this.prodajni = prodajni;
	}
	
	public double getKupovni() {
		return kupovni;
	}
	
	public void setKupovni(double kupovni) {
		if (kupovni < 0)
			throw new RuntimeException("Kupovni kurs ne sme biti negativan broj");
		this.kupovni = kupovni;
	}
	
	public double getSrednji() {
		return srednji;
	}
	
	public void setSrednji(double srednji) {
		if (srednji < 0)
			throw new RuntimeException("Srednji kurs ne sme biti negativan broj");
		this.srednji = srednji;
	}
	
	public GregorianCalendar getDatumKursa() {
		return datumKursa;
	}
	
	public void setDatumValute(GregorianCalendar datumKursa) {
		if (datumKursa == null) 
			throw new RuntimeException("Datum kursa ne sme biti null");
		this.datumKursa = datumKursa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((datumKursa == null) ? 0 : datumKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajni);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednji);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Valuta) {
			Valuta v = (Valuta)(obj);
		
			if (naziv.equals(v.naziv) && skraceniNaziv.equals(v.skraceniNaziv) 
					&& prodajni == v.prodajni && kupovni == v.kupovni
					&& srednji == v.srednji && datumKursa.equals(v.datumKursa))
				return true;
			return false;
		}
		System.out.println("Uneti objekat mora biti objekat klase Valuta");
		return false;
	}

	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv
				+ ", prodajni=" + prodajni + ", kupovni=" + kupovni
				+ ", srednji=" + srednji + ", datumKursa=" + datumKursa + "]";
	}
	
	
}
