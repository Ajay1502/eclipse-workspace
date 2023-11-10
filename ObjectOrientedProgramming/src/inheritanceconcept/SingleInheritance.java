package inheritanceconcept;

class Shape1{
	public void colour() {
		System.out.println("Displays colour of Shape");
	}
}

class Triangle1 extends Shape1{
	public void size() {
		System.out.println("Displays size of Shape");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
		Triangle1 triangle = new Triangle1();
		triangle.size();
		triangle.colour();
	}

}
