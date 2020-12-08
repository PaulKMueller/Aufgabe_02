package modellierung;

public class Dauer {
	private int minuten;
	private int sekunden;

	public int getMinuten() {
		return minuten;
	}

	public void setMinuten(int minuten) {
		this.minuten = minuten;
	}

	public int getSekunden() {
		return sekunden;
	}

	public void setSekunden(int sekunden) {
		this.sekunden = sekunden;
	}


	public Dauer(int minuten, int sekunden) {
		this.minuten = minuten;
		this.sekunden = sekunden;
	}

}
