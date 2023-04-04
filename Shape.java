package dy1122;

public class Shape {
	static int count;
	private String name;
	public Shape() {
		count++;
	};
	public Shape(String name) {
		this.name = name;
		count++;
	}
	public void draw() {
		System.out.println("도형Shape");
	}
	public void printArea() {
		System.out.println("도형 면적 구하기");
	}
	public void getGili() {
		System.out.println("도형 둘래 길이 구하기");
	}
 }

class Rect extends Shape {
	private int width;
	private int height;
	public Rect() {}
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		//TODO Auto-generated method stub
		System.out.println("사각형Rect");	
	}
	@Override
	public void printArea() {
		//TODO Auto-generated method stub
		int area = width * height;
		System.out.println("사각형의 면적 = " + area);
	}
	@Override
	public void getGili() {
		//TODO Auto-generated method stub
		int gili = (width + height) * 2;
		System.out.println("사각형 둘래 = " + gili);
	}
}