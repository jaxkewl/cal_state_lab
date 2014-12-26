import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//Create a java Application to perform the following tasks

//The main window should contain a JTextArea
//You can type any text in the JTextArea
//When the program closes it should save the contents of the JTextArea to a file. 
//You should handle the Window Close Event to do this
public class MartinHongJava2Lab2 extends JFrame {
	private JTextArea jTextArea;
	private String pathName = "/Users/admin/Documents/workspace/cal_state_lab/LabAssignments/src/saved_output.txt";

	public MartinHongJava2Lab2() {
		jTextArea = new JTextArea("Enter text, close window to save it to file\n\n");
		jTextArea.setCaretPosition(jTextArea.getText().length());
		add(jTextArea);
		setSize(600, 600);
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				File file = new File(pathName);
				try {
					overwriteFileWithText(jTextArea.getText(), file);
				} catch (IOException e1) {
					e1.printStackTrace();	
				}
			}

		});

	}

	private void overwriteFileWithText(String text, File file)
			throws IOException {
		if (file.isFile()) {
			file.delete();
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(file.getPath())));
			out.write(text);
			out.close();
		}
		else if (!file.exists()) {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(file.getPath())));
			out.write(text);
			out.close();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MartinHongJava2Lab2 martinHongJava2Lab2 = new MartinHongJava2Lab2();
		martinHongJava2Lab2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		martinHongJava2Lab2.setVisible(true);
	}

}
