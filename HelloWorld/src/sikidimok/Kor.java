package sikidimok;

public class Kor extends Sikidom {
	private double sugar;

	public Kor(double sugar) {
		this.sugar = sugar;
		szamolTerulet();
		szamolKerulet();
	}
	private void szamolTerulet() {
		terulet = sugar *sugar*Math.PI;
	}
	
	private void szamolKerulet() {
		setKerulet(sugar *2*Math.PI);
	}
	
	public void hello() {
		System.out.println("OK");
	}
}
