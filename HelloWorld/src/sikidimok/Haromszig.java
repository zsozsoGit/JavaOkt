package sikidimok;

public class Haromszig extends Sikidom {
	private double a, b, c, s;

	public Haromszig(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		szamolKerulet();
		szamolTerulet();

	}

	private void szamolTerulet() {
		s = getKerulet() / 2;
		terulet = Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	private void szamolKerulet() {
		setKerulet(a + b + c);
	}

}
