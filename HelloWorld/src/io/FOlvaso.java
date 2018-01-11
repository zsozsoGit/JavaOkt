package io;

import java.io.*;

public class FOlvaso {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			while (br.ready()) {
				System.out.println(br.readLine());

			}
			br.close();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
			System.out.println("Nincsen f·jl! …s es F¡¡¡J!!!");

		}
		System.out.println("webe");
	}

}
