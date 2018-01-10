package Fa5;

public class TomorHenger extends Henger {
	private double suruseg;

	public TomorHenger(double sugar, double magassag, double suruseg) {
		super(sugar, magassag);
		this.suruseg = suruseg;
		

	}
	public double getSuruseg() {
		return suruseg;
	}
	public double getTomeg() {
		return suruseg * getTerfogat();
	}
}
