package fa7telefon;

public class Teszt {

	public static void main(String[] args) {
		Bronze b = new Bronze();

		System.out.println(b.getFizetendo(10, 10));
		System.out.println(b.getFizetendo(100, 100));
		
		Ember E = new Ember("Pist", 10, 10);
		System.out.println(E);
		Ember E2 = new Ember("Pist", 10, 200);
		System.out.println(E2);
		System.out.println(E2.getCsomag().getFizetendo(10, 200));
	}

}
