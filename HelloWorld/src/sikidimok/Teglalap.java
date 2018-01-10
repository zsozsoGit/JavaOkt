package sikidimok;

public class Teglalap extends Sikidom {

	private double a, b;
	

	public Teglalap(int a, int b) {
		this.a = a;
		this.b = b;
		szamolKerulet();
		szamolTerulet();
	}

	private void szamolTerulet() {
		terulet = a * b;
	}

	private void szamolKerulet() {
		setKerulet((a + b) * 2);
	}
	
	public void hello() {
		System.out.println("OK");
	}

}
