import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.JApplet;

public class MartinHongLab2 extends JApplet {

	public void init() {
		// init doesn't need to do anything cause we are not asking the
		// user for input

	}

	public void paint(Graphics g) {

		// g.drawLine(1, 10, 40, 10);

		// print a line of text
		g.drawString("Hello World!", 1, 10);

		// draw a filled rectangle in red
		//g.drawRect(1, 25, 20, 15);
		g.setColor(Color.RED);
		g.fillRect(1, 25, 20, 15);

		// draw a filled triangle in blue
		g.setColor(Color.BLUE);
		Polygon p = new Polygon();
		int[] xint = new int[5];
		int[] yint = new int[5];
		
				
		xint[0] = 1;
		xint[1] = 40;
		xint[2] = 20;

		yint[0] = 75;
		yint[1] = 75;
		yint[2] = 50;

		p.npoints = 3;
		p.xpoints = xint;
		p.ypoints = yint;

		//g.drawPolygon(xint, yint, 3);
		g.fillPolygon(xint, yint, 3);

		
		// draw a filled circle in green.
		//g.drawOval(1, 85, 20, 20);
		g.setColor(Color.GREEN);
		g.fillOval(1, 85, 20, 20);
	}
}
