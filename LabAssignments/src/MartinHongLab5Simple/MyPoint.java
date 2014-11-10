package MartinHongLab5Simple;

public class MyPoint {

	private int x;
	private int y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void draw() {
		System.out.println(this);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public String toString(){
		return "Drawing MyPoint x=" + getX() + " y=" + getY();
	}
}
