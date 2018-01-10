package randomextend;

import java.util.Random;

public class Menorandom extends Random {

	@Override
	public int nextInt(int n) {
		return super.nextInt(n) + 1;
	}

	public int nextIntInterval(int tol, int ig) {
		return super.nextInt(1+ig - tol) + tol;

	}
}
