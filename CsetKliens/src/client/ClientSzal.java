package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSzal extends Thread {

	Socket sock;
	ClientFrame clientFrame;

	public ClientSzal(ClientFrame clientFrame) {
		this.clientFrame = clientFrame;
		try {
			//sock = new Socket("192.168.5.176", 1235);
			sock = new Socket("localhost", 1235);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.start();
	}

	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			while (true) {
				String szoveg = br.readLine();
				if (szoveg == null) {

					throw new Exception();
				}
				//System.out.println(szoveg);
				clientFrame.textArea.append(szoveg);
				clientFrame.textArea.append("\n");

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
