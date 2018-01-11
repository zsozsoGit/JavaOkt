package rekurzio;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(10));

	}

	private static int fibo(int i) {
		if (i <= 2) {
			return 1;
		} else {
			return fibo(i - 1) + fibo(i - 2);
		}
	}

}
