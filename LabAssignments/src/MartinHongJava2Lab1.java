import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MartinHongJava2Lab1 implements Runnable {

	public void setupFrame() {
		Lab1Panel lab1 = new Lab1Panel();
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(600, 600);
		jFrame.add(lab1);
		jFrame.setVisible(true);
	}

	public static void main(String[] args) {
		MartinHongJava2Lab1 martinHongJava2Lab1 = new MartinHongJava2Lab1();
		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		threadExecutor.execute(martinHongJava2Lab1);
	}

	@Override
	public void run() {
		setupFrame();
	}

}

class Lab1Panel extends JPanel {

	int x = 0;
	int y = 0;
	Color bgColor = Color.WHITE;
	Color ballColor = Color.RED;
	Dimension d = getSize();
	int refreshPd = 20; // ms
	int ballSize = 100;

	public Lab1Panel() {
		// TODO Auto-generated constructor stub
		this.setBackground(bgColor);

		// use the timer class from swing package to generate actionevents
		// to increment the x and position.

		Timer myTimer = new Timer(refreshPd, new PanelListener());
		myTimer.start();
	}

	private class PanelListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			x++;
			y++;
			repaint();
		}
	}

	// Create a program that does the following animations (Can be either an
	// applet or a JFrame Application)
	// Draws a Circle of color Red
	// Moves the circle from top left corner of the window to the lower right
	// corner
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(ballColor);
		g.fillOval(x, y, ballSize, ballSize);

	}
}
