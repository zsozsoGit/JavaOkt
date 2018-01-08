package hu.masterfield.alapok;


public class Numbers {

	public static void main(String[] args) {
		int szam = 5;

		System.out.println(szam);
		szam++;
		System.out.println(szam);
		int ujSzam;
		ujSzam = 1100000000;
		System.out.println(ujSzam + ": uj szam");
		ujSzam = ujSzam *2;
		System.out.println(ujSzam + ": uj szam 2. Negatíííív???");
		long bigNum = 1100000000 *2L;
		System.out.println(bigNum + ": uj szam 2. Negatíííív???megint");
		long nagySzam;
		nagySzam = 1100000000;
		System.out.println(nagySzam + ": uj nagySzam");
		nagySzam = nagySzam *2;
		System.out.println(nagySzam + ": uj nagySzam 2. Negatíííív???");
		System.out.println(Long.MAX_VALUE );
		
		float tort = 5.3F;
		System.out.println(tort);
		tort = 3/7;
		System.out.println(tort);
		tort = 3/7F;
		System.out.println(tort);
		
		double dTort = 3/7.0;
		System.out.println(dTort);
	}

}
