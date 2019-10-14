package de.htwberlin.prog2.ws1920;

class Address {
	
	// TEIL 1/3
	
	private String plz;
	private String strasse;
	private String hausNr;
	private String stadt;
	
	// TEIL 2/3

	public Address(String plz, String strasse, String hausNr, String stadt) {
		this.plz = plz;
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.stadt = stadt;
	}
	
	
	// TEIL 3/3
	public String getPlz() {
		return plz;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public String getHausNr() {
		return hausNr;
	}
	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	
	
	
	

}
