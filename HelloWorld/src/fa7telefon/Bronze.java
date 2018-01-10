package fa7telefon;

public class Bronze {
	private int elofizDij, percdij, smsAra;

	public void setElofizDij(int elofizDij) {
		this.elofizDij = elofizDij;
	}

	public void setPercdij(int percdij) {
		this.percdij = percdij;
	}

	public void setSmsAra(int smsAra) {
		this.smsAra = smsAra;
	}

	public Bronze() {

		elofizDij = 2000;
		percdij = 18;
		smsAra = 25;

	}
	

	@Override
	public String toString() {
		return this.getClass()+" [elofizDij=" + elofizDij + ", percdij=" + percdij + ", smsAra=" + smsAra + "]";
	}

	public int getFizetendo(int perc, int smsSzam) {
		int valoskoltseg = perc * percdij + smsSzam * smsAra;
		int fizetendo;
		if (valoskoltseg > elofizDij) {
			fizetendo = valoskoltseg;

		} else {
			fizetendo = elofizDij;
		}
		return fizetendo;
	}

}
