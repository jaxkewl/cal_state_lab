package MartinHongLab5;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private MyPoint p1;
	private MyLine[] lineList = new MyLine[2];

	public DrawPanel() {

		// when this class is constructed, we need to create points and lines
		p1 = new MyPoint(50, 50);
		lineList[0] = new MyLine(new MyPoint(50, 80), new MyPoint(80, 80));
		lineList[1] = new MyLine(new MyPoint(80, 100), new MyPoint(120, 100));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//draw the point
		p1.draw(g);

		
		//draw the line
		for (MyLine l : lineList) {
			l.draw(g);
		}
	}

}
