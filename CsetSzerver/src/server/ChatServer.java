package server;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class ChatServer {

	public static void main(String[] args) {
		Vector<SzerverSzal> szalak = new Vector<>();
		try {
			ServerSocket sSock = new ServerSocket(1235);
			while (true) {
				
				Socket sock = sSock.accept();
				System.out.println("Kapcsolat jött");
				SzerverSzal sSz = new SzerverSzal(sock, szalak);
				szalak.add(sSz);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
