package feladat1;

public class Teszt {

	public static void main(String[] args) {
		Alkalmazott sanyi = new Alkalmazott("Kovács Sándor", 50, 0);
		Alkalmazott evi = new Alkalmazott("Évi", 20, 0);

		// sanyi.nev="Sándor";
		// evi.nev = "Éva";
		//
		// System.out.println(sanyi.nev);
		//sanyi.setNev("Sándor bácsi");
		sanyi.setNev("");
		System.out.println(sanyi.getNev());
		sanyi.setFizetes(100000);
		System.out.println(sanyi.getFizetes());
		sanyi.fizetesemel();
		System.out.println(sanyi.getFizetes());
		sanyi.fizetesemel(1000);
		System.out.println(sanyi.getFizetes());
		sanyi.fizetesemel(20000);
		System.out.println(sanyi.getFizetes());
		evi.fizetesemel();
		System.out.println(evi.getFizetes());
		sanyi.fizetesemel(100d);
		System.out.println(sanyi.getFizetes());
		System.out.println(sanyi);
	}

}
