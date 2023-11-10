package inheritanceconcept;

class Shape4{
	public void size() {
		System.out.println("show the shape size");
	}
}

class Triangle4 extends Shape4{
	public void colour() {
		System.out.println("show the triangle colour");
	}
}

class Rectangle3 extends Triangle4{
	public void side() {
		System.out.println("show the rectangle side");
	}
}

class Circle extends Shape4{
	public void radius() {
		System.out.println("show the circle radius");
		
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius();
		circle.size();
	
		Rectangle3 rectangle3 = new Rectangle3();
		rectangle3.side();
		rectangle3.colour();
		rectangle3.size();
     
	}

}
