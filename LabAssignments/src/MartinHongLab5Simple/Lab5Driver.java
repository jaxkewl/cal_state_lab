package MartinHongLab5Simple;

import MartinHongLab5Simple.MyLine;
import MartinHongLab5Simple.MyPoint;

public class Lab5Driver {

	public static void main(String[] args) {

		// create the point
		MyPoint p1 = new MyPoint(50, 50);
		p1.draw();
		System.out.println();
		
		
		// create the line
		MyLine[] lineList = new MyLine[2];
		lineList[0] = new MyLine(new MyPoint(50, 80), new MyPoint(80, 80));
		lineList[1] = new MyLine(new MyPoint(80, 100), new MyPoint(120, 100));

		for(MyLine line : lineList) {
			line.draw();
			System.out.println();
		}
		
	}

}
