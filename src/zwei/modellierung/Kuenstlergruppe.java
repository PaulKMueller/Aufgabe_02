package zwei.modellierung;

public class Kuenstlergruppe {
	
	private Kuenstler interpret;
	private Kuenstler komponist;
	private Kuenstler texter;

	public Kuenstler getInterpret() {
		return interpret;
	}

	public void setInterpret(Kuenstler interpret) {
		this.interpret = interpret;
	}

	public Kuenstler getKomponist() {
		return komponist;
	}

	public void setKomponist(Kuenstler komponist) {
		this.komponist = komponist;
	}

	public Kuenstler getTexter() {
		return texter;
	}

	public void setTexter(Kuenstler texter) {
		this.texter = texter;
	}
	
	public Kuenstlergruppe(Kuenstler interpret,Kuenstler komponist, Kuenstler texter) {
		this.interpret = interpret;
		this.komponist = komponist;
		this.texter = texter;
	}

}
