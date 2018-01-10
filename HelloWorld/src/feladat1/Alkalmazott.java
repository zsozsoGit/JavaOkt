package feladat1;

public class Alkalmazott {
	private String nev;
	private int kor;
	private long fizetes;
	
	

	@Override
	public String toString() {
		return "Alkalmazott [nev: " + nev + ", kor: " + kor + ", fizetes: " + fizetes + "]";
	}

	public void fizetesemel() {
		fizetes += 5000;

	}

	public void fizetesemel(int emeles) {
		fizetes += emeles;

	}
	
	public void fizetesemel(double emelesSzazalek) {
		fizetes *= 1+emelesSzazalek/100;

	}

	public Alkalmazott(String nev, int kor, long fizetes) {

		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
//		System.out.println("Letrejottem");
	}
	public Alkalmazott() {
		
	}
	public void setNev(String nev) {
		if (nev.length() > 0) {
			this.nev = nev;
		}

	}

	public String getNev() {
		return nev;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

}
