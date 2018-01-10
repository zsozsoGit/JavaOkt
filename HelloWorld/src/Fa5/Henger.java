package Fa5;

public class Henger {

	private double sugar, magassag;

	public Henger(double sugar, double magassag) {
		this.sugar = sugar;
		this.magassag = magassag;
	}

	public double getSugar() {
		return sugar;
	}

	public double getMagassag() {
		return magassag;
	}

	public double getTerfogat() {
		return Math.pow(sugar, 2) * Math.PI * magassag;
	}

	public double getFelszin() {
		return Math.pow(sugar, 2) * Math.PI * 2 + 2 * sugar * Math.PI * magassag;
	}

}
