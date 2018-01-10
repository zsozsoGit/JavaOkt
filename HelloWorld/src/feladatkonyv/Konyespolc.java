package feladatkonyv;

public class Konyespolc {

	private int polcok_szama;
	private int kapacitas;
	private int[] polcok;

	public void hozzaad(int mennyit) {
		for (int j = 0; j < polcok.length; j++) {
			hozzaad(j, mennyit);
		}

	}

	public void hozzaad(int melyikhez, int mennyit) {

		polcok[melyikhez] += mennyit;
		polcok[melyikhez] = (polcok[melyikhez] > kapacitas) ? kapacitas : polcok[melyikhez];

	}

	public Konyespolc(int polcok_szama) {
		this.polcok_szama = polcok_szama;
		kapacitas = 10;
		polcok = new int[polcok_szama];
	}

	public Konyespolc() {
		polcok_szama = 5;
		kapacitas = 10;
		polcok = new int[polcok_szama];
	}

	public Konyespolc(int polcok, int[] konyvek_szama) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder eredmeny = new StringBuilder();
		for (int i = 0; i < polcok.length; i++) {
			for (int j = 0; j < kapacitas; j++) {
				if (j < polcok[i]) {
					eredmeny.append("X");
				} else {
					eredmeny.append("_");
				}

			}
			eredmeny.append("\n");
		}

		// return super.toString();
		return eredmeny.toString();
	}

	public Konyespolc(int polcok_szama, int kapacitas, int[] polcok) {
		this.polcok_szama = polcok_szama;
		this.kapacitas = kapacitas;
		this.polcok = polcok;
	}

	public int osszes() {
		int sum = 0;
		for (int i : polcok) {
			sum += i;
		}
		return sum;
	}

}
