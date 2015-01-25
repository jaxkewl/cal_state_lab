import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


//this class was using JPanel and Runnable.
public class Lab1 extends JPanel implements Runnable {

	int x = 0;
	int y = 0;

	public Lab1() {
		// TODO Auto-generated constructor stub

		x = 0;
		y = 0;


	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (x < this.getWidth() && y < this.getHeight()) {

			repaint();
			try {
				Thread.sleep(50);
				x += 5;
				y += 5;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public void paint(Graphics g) {

		// super just clears the screen
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) {
		Lab1 animation = new Lab1();
		Thread myThread = new Thread(animation);

		
		JFrame jFrame = new JFrame();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(400, 400);
		jFrame.add(animation);
		jFrame.setVisible(true);
		
		myThread.start();
	}
}
