package zwei.modellierung;

import java.sql.Date;

public class Kuenstler {

	private String vorname;
	private String nachname;
	private Date ersterscheinung;

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Date getErsterscheinung() {
		return ersterscheinung;
	}

	public void setErsterscheinung(Date ersterscheinung) {
		this.ersterscheinung = ersterscheinung;
	}
	
	public Kuenstler(String vorname, String nachname, Date ersterscheinung) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.ersterscheinung = ersterscheinung;
	}
	
}
