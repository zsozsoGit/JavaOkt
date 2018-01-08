package hu.masterfield.alapok;

import java.util.Random;

public class Fa2 {

	public static void main(String[] args) {

		Random randa = new Random();
		System.out.println(randa.nextInt(10));
		int meret = randa.nextInt(11)+20;
		int [] x = new int [meret];
		//(randa.nextInt());
	}

}
