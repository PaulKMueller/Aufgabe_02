package modellierung;

import java.sql.Date;

public class Label {

	private String name;
	private Anschrift anschrift;
	private Date gruendungsdatum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Anschrift getAnschrift() {
		return anschrift;
	}

	public void setAnschrift(Anschrift anschrift) {
		this.anschrift = anschrift;
	}

	public Date getGruendungsdatum() {
		return gruendungsdatum;
	}

	public void setGruendungsdatum(Date gruendungsdatum) {
		this.gruendungsdatum = gruendungsdatum;
	}

	public Label(String name, Anschrift anschrift, Date gruendungsdatum){
		this.name = name;
		this.anschrift = anschrift;
		this.gruendungsdatum = gruendungsdatum;
	}
}
