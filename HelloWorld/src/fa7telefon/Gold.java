package fa7telefon;

public class Gold extends Silver {
	private int ingyenPerc;

	public void setIngyenPerc(int ingyenPerc) {
		this.ingyenPerc = ingyenPerc;
	}
	
	public Gold() {
		setElofizDij(4000);
		setPercdij(12);
		setSmsAra(15);
		setIngyenSms(20);
		setIngyenPerc(30);
	}
	public int getFizetendo(int perc, int smsSzam) {
		perc -= ingyenPerc;
		if (perc <0) perc = 0;
		return super.getFizetendo(perc, smsSzam);
	}
}
