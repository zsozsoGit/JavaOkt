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
		System.out.println(ujSzam + ": uj szam 2. Negat����v???");
		long bigNum = 1100000000 *2L;
		System.out.println(bigNum + ": uj szam 2. Negat����v???megint");
		long nagySzam;
		nagySzam = 1100000000;
		System.out.println(nagySzam + ": uj nagySzam");
		nagySzam = nagySzam *2;
		System.out.println(nagySzam + ": uj nagySzam 2. Negat����v???");
		System.out.println(Long.MAX_VALUE );
		
		float tort = 5.3F;
		System.out.println(tort);
		tort = 5/7;
		System.out.println(tort);
		tort = 5/7F;
		System.out.println(tort);
		
		double dTort = 5/7.0;
		System.out.println(dTort+ "fura kerek�t�s");
		System.out.println("6:"+(5+6)+":::5+6");
		System.out.println("6:"+5+6+":::5+6");
		boolean logikai = 5==6;
		System.out.println(logikai);
		logikai = true;
		System.out.println(logikai);
		char betu = 'd';
		System.out.println(betu);
		char charakter = '\n';
		System.out.println(charakter);
		System.out.println("Kov�cs" + charakter+ "\"B�la\"");
	}

}
