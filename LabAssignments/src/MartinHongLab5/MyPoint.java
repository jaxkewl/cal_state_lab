package MartinHongLab5;

import java.awt.Color;
import java.awt.Graphics;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("Point", (x - 40), y);
		g.drawLine(x , y, (x + 1), (y));
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
