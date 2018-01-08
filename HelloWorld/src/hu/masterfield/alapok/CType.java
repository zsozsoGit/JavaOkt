package hu.masterfield.alapok;

public class CType {

	public static void main(String[] args) {
		int szam = 1;
		szam++;
		System.out.println(szam);
		System.out.println(szam++);
		System.out.println(++szam);
		szam += 4538;
		System.out.println(szam);
		szam *= szam;
		System.out.println(szam);
		String str1 = "HW";
		System.out.println(str1);
		
		String str2 = "HW"; //Implicit konstruktor
		System.out.println(str2);
		System.out.println(str1==str2);
		str1 = "22";
		System.out.println(str1==str2);
		System.out.println("-----------------------------");
		String str32 = new String("HW"); 
		System.out.println(str2==str32);
		System.out.println(str2);
		System.out.println(str32);
		System.out.println(str2.equals(str32));
	}

}
