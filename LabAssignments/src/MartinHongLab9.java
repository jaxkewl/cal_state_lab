import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MartinHongLab9 extends JFrame {

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenuItem exitItem;
	private JMenuItem clearItem;

	public MartinHongLab9() {
		super("Martin Hong Lab 9");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		JMenuBar bar = new JMenuBar();

		// take care of the File Menu stuff
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic('F');
		exitItem = new JMenuItem("Exit");
		exitItem.setMnemonic('x');
		fileMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		bar.add(fileMenu);

		// take care of the Edit menu stuff, no need to implement a listener
		editMenu = new JMenu("Edit");
		editMenu.setMnemonic('E');
		clearItem = new JMenuItem("Clear");
		clearItem.setMnemonic('C');
		editMenu.add(clearItem);
		bar.add(editMenu);

		add(bar);
		setJMenuBar(bar);
	}

	public static void main(String[] args) {
		MartinHongLab9 martinHongLab9 = new MartinHongLab9();
		martinHongLab9.setVisible(true);

	}

}
