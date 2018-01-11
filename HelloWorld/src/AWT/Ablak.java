package AWT;

import java.awt.*;
import java.awt.event.*;

public class Ablak extends Frame implements WindowListener, ActionListener {
	static int i;
	// Konstruktorban rendezem be
	public Ablak() throws HeadlessException {
		i++;
		setVisible(true);
		setSize(300, 200);
		setLocation(100+i*100, 100);
		addWindowListener(this);
		
		Button gomb = new Button("Cim Valtozatt");
		setLayout(new FlowLayout());
		add(gomb, BorderLayout.CENTER);
		gomb.addActionListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		

	}

	@Override
	public void windowClosed(WindowEvent e) {
		new Ablak();
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setTitle("ujjjj");
		
	}

}
