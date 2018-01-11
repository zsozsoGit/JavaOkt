package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.Vector;

public class SzerverSzal extends Thread {
	Socket sock;
	Vector<SzerverSzal> szalak;

	public SzerverSzal(Socket sock, Vector<SzerverSzal> szalak) {
		this.sock = sock;
		this.szalak = szalak;
		this.start();
	}

	@Override
	public void run() {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while (true) {
				String szoveg = br.readLine();
				new Log(szoveg);
				if(szoveg == null) {
					szalak.remove(this);
					throw new Exception();
				}
				System.out.println(szoveg);
				for (int i = 0; i < szalak.size(); i++) {
					if (szalak.get(i)!=this) {
						szalak.get(i).ir(szoveg);
					}

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ir(String s) {
		try {
			PrintWriter pw = new PrintWriter(sock.getOutputStream());
			pw.println(s);
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
