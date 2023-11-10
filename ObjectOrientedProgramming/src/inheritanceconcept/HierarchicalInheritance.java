package inheritanceconcept;

class Shape2{
	public void size() {
		System.out.println("show the shape size");
	}
}

class Triangle2 extends Shape2{
	public void colour() {
		System.out.println("show the triangle colour");
	}
}
class Rectangle extends Shape2{
	public void colour() {
		System.out.println("show the rectangle colour");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.colour();
		rectangle.size();
		
		Triangle2 triangle2 = new Triangle2();
		triangle2.colour();
		triangle2.size();
	}

}
