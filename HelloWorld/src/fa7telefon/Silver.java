package fa7telefon;

public class Silver extends Bronze {
	private int ingyenSms;

	public Silver() {
		setElofizDij(3000);
		setPercdij(15);
		setSmsAra(20);
		setIngyenSms(10);
	}

	public void setIngyenSms(int ingyenSms) {
		this.ingyenSms = ingyenSms;
	}
	
	public int getFizetendo(int perc, int smsSzam) {
		smsSzam -= ingyenSms;
		if (smsSzam <0) smsSzam = 0;
		return super.getFizetendo(perc, smsSzam);
	}

}
