package MartinHongLab5;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		// draw a single point.

		DrawPanel panel = new DrawPanel();

		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);

	}

}
