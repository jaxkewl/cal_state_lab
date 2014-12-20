import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MartinHongLab10 extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int middleX = getWidth() / 2;
		int middleY = getHeight() / 2;

		for (int i = 10; i <= 80; i += 10) {
			g.drawArc(middleX - i / 2, middleY - i / 2, i, i, 0, 360);
		}

	}

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		MartinHongLab10 martinHongLab10 = new MartinHongLab10();
		jFrame.add(martinHongLab10);

		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(400, 400);
		jFrame.setVisible(true);
	}

}
