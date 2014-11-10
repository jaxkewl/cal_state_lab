package MartinHongLab5;

import java.awt.Color;
import java.awt.Graphics;

public class MyLine {

	private MyPoint p1;
	private MyPoint p2;

	public MyLine(MyPoint p1, MyPoint p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("Line", (p1.getX() - 40), p1.getY());
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
}
