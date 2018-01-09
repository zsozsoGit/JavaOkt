package hu.masterfield.alapok;

import java.util.Random;

public class Szulinap {

	public static void main(String[] args) {
		final int LETSZAM = 50;
		final int TRY_NUM = 1000000;

		
		int sikeres = 0;
		for (int ii = 0; ii < TRY_NUM; ii++) {
			int i = 0;
			int[] Szulinapok = tombGen(LETSZAM);
			//tombKiir(Szulinapok);
			boolean vanIsmetlodes = false;
			while (!vanIsmetlodes && i < Szulinapok.length - 1) {
				int j = i + 1;
				while (!vanIsmetlodes && j < Szulinapok.length) {
					if (Szulinapok[i] == Szulinapok[j]) {
						vanIsmetlodes = true;
						sikeres++;
						//System.out.println(Szulinapok[i]);
						//System.out.println("\n---------------");
					}
					j++;
				}
				i++;
			}

			// System.out.println(vanIsmetlodes);
		}
		System.out.println((double)sikeres/TRY_NUM);
	}

	public static int[] tombGen(int size) {
		Random randa = new Random();
		// System.out.println(randa.nextInt(10));

		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			x[i] = 1 + randa.nextInt(365);
		}
		//System.out.println(x.length);
		//System.out.println("---------------");

		return x;
	}

	public static void tombKiir(int[] t) {
		for (int i : t) {
			System.out.print(" " + i);
		}
		System.out.println("\n---------------");
	}

}
