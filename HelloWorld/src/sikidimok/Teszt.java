package sikidimok;

public class Teszt {

	public static void main(String[] args) {
		Kor idom1 = new Kor(10);
		System.out.println( idom1.getTerulet());
		System.out.println( idom1.getKerulet());
		Teglalap idom2 = new Teglalap(5, 6);
		System.out.println( idom2.getTerulet());
		System.out.println( idom2.getKerulet());
		Haromszig idom3 = new Haromszig(2, 2, 3);
		System.out.println( idom3.getTerulet());
		System.out.println( idom3.getKerulet());
		Sikidom idom = new Kor(11);
		((Kor) idom).hello();
		idom = idom2;
		idom1.hello();
		//((Kor) idom).hello();
		Object o = new Kor(11);
		System.out.println( ((Sikidom)o).getKerulet());

	}

}
