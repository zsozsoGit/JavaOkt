package hu.masterfield.alapok;

public class Fgv {

	public static void main(String[] args) {
		udv();
		udvnev("Béla");
		int teszt = 5;
		int[] teszttomb = { 1, 2, 3 };
		teszt1(teszt);
		name(teszttomb);
		System.out.println(" teszt: " + teszt + "\tteszttomb: " + teszttomb[0]);
		System.out.println(kobb(1.5));
		System.out.println(kobb(15));
	}
//https://stackoverflow.com/questions/2721546/why-dont-java-generics-support-primitive-types
	// Java not supports generics with primitives
//public static <T> kobb(<T> d) {
//		
//		return d;
//	}

	public static int kobb(int inp) {
		return inp * inp * inp;
	}

	public static double kobb(double inp) {
		return inp * inp * inp;
	}

	public static void udv() {

		System.out.println("Üdv Program");

	}

	public static void udvnev(String nev) {

		System.out.println("Üdv Program " + nev);

	}

	public static void teszt1(int i) {
		i++;
		System.out.println(i);
	}

	public static void name(int[] j) {
		j[0] = 11;
		System.out.println(j[0]);
	}

}
