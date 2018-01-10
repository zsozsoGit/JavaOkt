package randomextend;

public class Teszt {

	public static void main(String[] args) {
		Menorandom rand = new Menorandom();
		for (int i = 0; i < 11; i++) {
			System.out.println(rand.nextInt(3));
			System.out.println(rand.nextIntInterval(20, 30));
			
		}
		
	}

}
