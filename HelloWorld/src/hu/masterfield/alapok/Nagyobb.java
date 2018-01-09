package hu.masterfield.alapok;

import java.util.Random;

public class Nagyobb {

	public static void main(String[] args) {
		Random randa = new Random();
		int veletlen = randa.nextInt(10);
		int veletlen2 = randa.nextInt(10);
		int veletlen3 = randa.nextInt(10);
		System.out.println(veletlen + ", " + veletlen2 + ", " + veletlen3);
		/*
		 * if (veletlen > veletlen2) {
		 * 
		 * // veletlen2 nem jo if (veletlen3 > veletlen) {
		 * System.out.println(veletlen3); } else { System.out.println(veletlen); }
		 * 
		 * } else { //veletlen nem jo if (veletlen3 > veletlen2) {
		 * System.out.println(veletlen3); } else { System.out.println(veletlen2); } }
		 */
//		if (veletlen > veletlen2 && veletlen > veletlen3) {
//			System.out.println(veletlen);
//		} else {
//			if (veletlen3 > veletlen2) {
//				System.out.println(veletlen3);
//			} else {
//				System.out.println(veletlen2);
//			}
//		}
		int maximum = veletlen;
		if (veletlen2>maximum) maximum = veletlen2;
		
	}

}
