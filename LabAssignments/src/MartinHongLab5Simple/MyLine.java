package MartinHongLab5Simple;

public class MyLine {

	private MyPoint p1;
	private MyPoint p2;

	public MyLine(MyPoint p1, MyPoint p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void draw() {
		System.out.println("Drawing MyLine ");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}
