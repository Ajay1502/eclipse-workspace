package inheritanceconcept;

class Shape{
	public String colour;
}
class Triangle extends Shape{
	
}

public class Inheritance {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.colour = "red";
		System.out.println(t1.colour);
	}
}
/* Inheritance are four type 
  	-Single inheritance
  	-Hierarchical inheritance
  	-Multilevel inheritance
  	-Hybrid inheritance
  	
   1. Single inheritance : When one class inherits another class, it is known as single level inheritance 

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}

	2.Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}

	3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class. 

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class EquilateralTriangle extends Triangle {
   int side;
}

	4. Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 
 */