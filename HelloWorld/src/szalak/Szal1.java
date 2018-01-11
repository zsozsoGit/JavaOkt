package szalak;

public class Szal1 extends Thread {
	private long varakozas;

	public Szal1(int varakozas) {
		this.varakozas = varakozas;
		this.start();
		//this.run(); rossz
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				this.sleep(varakozas);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
