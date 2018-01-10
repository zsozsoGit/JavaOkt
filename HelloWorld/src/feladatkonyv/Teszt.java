package feladatkonyv;

public class Teszt {

	public static void main(String[] args) {
		Konyespolc k1 = new Konyespolc();
		Konyespolc k2 = new Konyespolc(12); // 12 polc
		int[] polc = { 1, 2, 3, 9,11,2,1 };
		Konyespolc k3 = new Konyespolc(polc.length, 15, polc);
		System.out.println(k3.toString());
		System.out.println(k3.osszes());
		k3.hozzaad(3, 3);
		System.out.println(k3.toString());
		System.out.println(k3.osszes());
		k3.hozzaad(4, 1000);
		System.out.println(k3.toString());
		System.out.println(k3.osszes());
		k3.hozzaad(1);
		System.out.println(k3.toString());
		System.out.println(k3.osszes());

	}

}
