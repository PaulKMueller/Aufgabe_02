package zwei.modellierung;

import java.sql.Date;

public class Album {

	private String titel;
	private String interpret;
	private Label label;
	private Date datum;

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public void setInterpret(String interpret) {
		this.interpret = interpret;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public void setLiederzahl(int liederzahl) {
		this.liederzahl = liederzahl;
	}

	public String getTitel() {
		return titel;
	}

	public String getInterpret() {
		return interpret;
	}

	public Label getLabel() {
		return label;
	}

	public Date getDatum() {
		return datum;
	}

	public int getLiederzahl() {
		return liederzahl;
	}

	private int liederzahl;

	public Album(String titel, String interpret, Label label, Date datum, int liederzahl){
		this.titel = titel;
		this.interpret = interpret;
		this.label = label;
		this.datum = datum;
		this.liederzahl = liederzahl;
	}
	
}
