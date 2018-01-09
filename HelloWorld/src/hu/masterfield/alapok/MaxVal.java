package hu.masterfield.alapok;

import java.util.Random;

public class MaxVal {

	public static void main(String[] args) {

		final int meret = 10;
		int[] i = tombGen(meret);
		tombKiir(i);
		int max = getMax(i);
		System.out.println("\n---------------");
		System.out.println(max);
		System.out.println("\n---------------");
		if (eldont(i, 11))
			System.out.println("van");
		else
			System.out.println("nincsen");
	}

	private static boolean eldont(int[] i, int j) {
		boolean retval = false;
		int it = 0;
		while (!retval && it < i.length) {

			if (i[it] % j == 0) {
				retval = true;
				System.out.println(i[it]);
			}
			it++;
		}

		return retval;
	}

	private static int getMax(int[] i) {
		int maximum = i[0];
		for (int j : i) {
			if (j > maximum)
				maximum = j;
		}

		return maximum;
	}

	public static int[] tombGen(int size) {
		Random randa = new Random();
		// System.out.println(randa.nextInt(10));

		int[] x = new int[size];
		for (int i = 0; i < x.length; i++) {
			x[i] = randa.nextInt(999);
		}
		System.out.println(x.length);
		System.out.println("---------------");

		return x;
	}

	public static void tombKiir(int[] t) {
		for (int i : t) {
			System.out.print(" " + i);
		}
	}

}
