

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class MartinHong2Lab1 extends JApplet implements Runnable {

	int x = 0;
	int y = 0;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();

		x = 0;
		y = 0;
		Thread theThread = new Thread(this);
		theThread.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (x < this.getWidth() && y < this.getHeight()) {

			repaint();
			try {
				Thread.sleep(100);
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
		g.setColor(Color.RED);
		g.fillOval(x, y, 50, 50);
	}

}
