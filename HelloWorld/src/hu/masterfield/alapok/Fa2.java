package hu.masterfield.alapok;

import java.util.Random;

public class Fa2 {

	public static void main(String[] args) {

		Random randa = new Random();
		//System.out.println(randa.nextInt(10));
		int meret = randa.nextInt(11)+20;
		int [] x = new int [meret];
		for (int i = 0; i < x.length; i++) {
			x[i] = randa.nextInt(999)+1001;
		}
		System.out.println(x.length);
		System.out.println("---------------");
		float sum = 0;
		for (int i : x) {
			System.out.print(" "+i);
			sum +=i;
		}
		System.out.println("\n---------------");
		System.out.println("sum: "+ sum + " atlag: "+(sum/(x.length)));
	}

}
