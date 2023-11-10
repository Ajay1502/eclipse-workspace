package inheritanceconcept;

class Shape3{
	public void size() {
		System.out.println("show the shape size");
	}
}

class Triangle3 extends Shape3{
	public void colour() {
		System.out.println("show the triangle colour ");
	}
}

class Rectangle1 extends Triangle3{
	public void sides() {
		System.out.println("show the rectangle sides");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		Rectangle1 rectangle1 = new Rectangle1();
		rectangle1.sides();
		rectangle1.colour();
		rectangle1.size();

	}

}
