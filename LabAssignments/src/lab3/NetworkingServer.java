package lab3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amir
 */
public class NetworkingServer extends JFrame {
	Socket con;
	ObjectInputStream input;
	ObjectOutputStream output;

	private JTextField textBox;
	private JLabel labelBox;

	public NetworkingServer() {

		super("Networking Server");

		// setup the input box for the server
		textBox = new JTextField();
		add(textBox, BorderLayout.NORTH);
		textBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendData(e.getActionCommand());
				textBox.setText("");
			}
		});

		// setup the response box for the server
		labelBox = new JLabel();
		add(labelBox, BorderLayout.CENTER);

	}

	protected void sendData(String actionCommand) {
		
		
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		NetworkingServer myapp = new NetworkingServer();
		myapp.myServer();
	}

	public void myServer() {
		try {
			String str = "waiting to read";
			ServerSocket server = new ServerSocket(5234, 100);
			con = server.accept();
			System.out.println("Connected to Client");
			output = new ObjectOutputStream(con.getOutputStream());
			input = new ObjectInputStream(con.getInputStream());
			while (true) {
				str = (String) input.readObject();
				if (str != null)
					System.out.println(str);
			}
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		} finally {
			try {
				input.close();
				output.close();
				con.close();

			} catch (IOException e) {

			}
		}
	}
}
