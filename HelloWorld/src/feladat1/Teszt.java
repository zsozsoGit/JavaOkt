package feladat1;

public class Teszt {

	public static void main(String[] args) {
		Alkalmazott sanyi = new Alkalmazott("Kov�cs S�ndor", 50, 0);
		Alkalmazott evi = new Alkalmazott("�vi", 20, 0);

		// sanyi.nev="S�ndor";
		// evi.nev = "�va";
		//
		// System.out.println(sanyi.nev);
		//sanyi.setNev("S�ndor b�csi");
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
