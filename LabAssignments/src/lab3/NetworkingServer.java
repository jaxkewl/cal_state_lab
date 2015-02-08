package lab3;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.SwingUtilities;

public class NetworkingServer extends JFrame {
	Socket con;
	ObjectInputStream input;
	ObjectOutputStream output;

	private JTextField textBox;
	private JLabel labelBox;

	public NetworkingServer() throws IOException {

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
		labelBox.setForeground(Color.BLUE);
		add(labelBox, BorderLayout.CENTER);

		setSize(400, 100);
		setVisible(true);

		// setup sockets and streams
		myServer();
	}

	protected void sendData(String actionCommand) {
		try {
			output.writeObject(actionCommand);
			output.flush();
			displayMessage("SERVER>>> " + actionCommand);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// display the input stream message to the label box
	private void displayMessage(final String messageToDisplay) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() // updates displayArea
			{
				labelBox.setText(messageToDisplay);
			}
		});
	}

	// setup the server socket, streams, and listen for inputs
	public void myServer() throws IOException {
		try {
			displayMessage("waiting to connect");
			ServerSocket server = new ServerSocket(12345, 100);
			con = server.accept();
			displayMessage("Connected to Client");
			input = new ObjectInputStream(con.getInputStream());
			output = new ObjectOutputStream(con.getOutputStream());
			while (true) {
				String str = (String) input.readObject();
				if (str != null)
					displayMessage("CLIENT>>> " + str);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {

			output.close();
			con.close();
			input.close();
		}
	}

	public static void main(String[] args) throws IOException {

		
		try {
			// instantiate our server
			NetworkingServer myapp = new NetworkingServer();
		} catch (Exception e) {
			System.out.println("Connection closed");
		}

	}

}
