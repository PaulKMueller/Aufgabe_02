package modellierung;

public class Lied {

	private String titel;
	private Kuenstlergruppe gruppe;
	private Dauer dauer;

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Kuenstlergruppe getGruppe() {
		return gruppe;
	}

	public void setGruppe(Kuenstlergruppe gruppe) {
		this.gruppe = gruppe;
	}

	public Dauer getDauer() {
		return dauer;
	}

	public void setDauer(Dauer dauer) {
		this.dauer = dauer;
	}

	public Lied(String titel, Kuenstlergruppe gruppe, Dauer dauer) {
		this.titel = titel;
		this.gruppe = gruppe;
		this.dauer = dauer;
	}
	
}
