package fa7telefon;

public class Ember {
	private String nev;
	private Bronze csomag;
	private int percek, smsek;

	public Ember(String nev, int percek, int smsek) {
		this.nev = nev;
		this.percek = percek;
		this.smsek = smsek;
		csomagValaszt();
	}

	public Bronze getCsomag() {
		return csomag;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return csomag.toString();
	}

	private void csomagValaszt() {
		Bronze B = new Bronze();
		Silver S = new Silver();
		Gold G = new Gold();

		if (B.getFizetendo(percek, smsek) < S.getFizetendo(percek, smsek)
				&& B.getFizetendo(percek, smsek) < G.getFizetendo(percek, smsek)) {
			this.csomag = B;
		} else if (S.getFizetendo(percek, smsek) < G.getFizetendo(percek, smsek)) {
			this.csomag = S;

		} else
			this.csomag = G;

	}
}
