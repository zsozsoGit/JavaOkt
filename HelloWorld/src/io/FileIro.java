package io;

import java.io.*;

public class FileIro {
	// Hiba elnyelése!!!
	// public static void main(String[] args) throws IOException {
	// FileWriter fw = new FileWriter("test.txt");
	// }

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test.txt");
//			fw.write("1.sor\r\n");
//			fw.write("2.sor\r\n");
//			fw.write("3.sor\n");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("1. sor");
			pw.println("2. sor");
			pw.flush();
			pw.close(); // lezarja az fw-t is!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
