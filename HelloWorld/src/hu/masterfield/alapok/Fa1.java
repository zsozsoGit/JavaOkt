package hu.masterfield.alapok;

public class Fa1 {

	public static void main(String[] args) {
		int hossz = (args[0].length());
		System.out.println(hossz);
		int ertek = Integer.parseInt(args[0]);
		int eredmeny = hossz*ertek;
		System.out.println(eredmeny);

	}

}
