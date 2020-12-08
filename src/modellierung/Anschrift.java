package modellierung;

public class Anschrift {

	private String strasse;
	private String stadt;
	private int plz;
	
	public Anschrift(String strasse, String stadt, int plz) {
		this.strasse = strasse;
		this.stadt = stadt;
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public int getPlz() {
		return plz;
	}

	public void setPlz(int plz) {
		this.plz = plz;
	}
}
