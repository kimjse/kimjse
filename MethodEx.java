package dy1122;

class Circle extends Shape {
	private int radius;
	public Circle() {}
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	public void draw() {
		//TODO Auto-generated method stub
		System.out.println("원을 그려요~~");	
		}
	@Override
	public void printArea() {
		//TODO Auto-generated method stub
		double area = 3.14 * radius *radius;
		System.out.println("원의 면적= " + area);
		}
	@Override
	public void getGili() {
		//TODO Auto-generated method stub
		double gili = 3.14 * 2 * radius;
		System.out.println("원의 둘래 = " + gili);
		}
	}
public class MethodEx {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Shape sh1 = new Shape();
		sh1.draw();
		sh1.printArea();
		sh1.getGili();
		Rect r1 = new Rect("사각형", 2, 4);
		r1.draw();
		r1.printArea();
		r1.getGili();
		Rect r2 = new Rect("TV", 65, 40);
		r2.draw();
		r2.printArea();
		r2.getGili();
		Circle c1 = new Circle("원", 3);
		c1.draw();
		c1.printArea();
		c1.getGili();
		Circle c2 = new Circle("pizza", 10);
		c2.draw();
		c2.printArea();
		c2.getGili();
	}
}
