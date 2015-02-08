package lab3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class NetworkingClient extends JFrame {
	Socket con;
	ObjectInputStream input;
	ObjectOutputStream output;

	private JTextField textBox;
	private JLabel labelBox;

	public NetworkingClient() throws IOException {

		super("Networking Client");

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

		setSize(400, 100);
		setVisible(true);

		// setup sockets and streams
		myClient();
	}

	protected void sendData(String actionCommand) {
		try {
			output.writeObject(actionCommand);
			output.flush();
			displayMessage("CLIENT>>> " + actionCommand);
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

	
	//setup socket, streams, and listen for input
	public void myClient() throws IOException {
		try {
			displayMessage("waiting to connect");
			con = new Socket(InetAddress.getLocalHost(), 12345);

			displayMessage("Connected to Server");
			output = new ObjectOutputStream(con.getOutputStream());
			input = new ObjectInputStream(con.getInputStream());
			while (true) {
				String str = (String) input.readObject();
				if (str != null)
					displayMessage("SERVER>>> " + str);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch(SocketException exc) {
			displayMessage("Connection closed...");
			
		}
		finally {
			output.close();
			con.close();
			input.close();
		}
	}

	public static void main(String[] args) throws IOException {


		try {
			// instantiate our client
			NetworkingClient myapp = new NetworkingClient();	
		} catch (Exception e) {
			System.out.println("Connection closed");
		}

	}

}
