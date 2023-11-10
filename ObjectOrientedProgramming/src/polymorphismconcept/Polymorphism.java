package polymorphismconcept;

class Student{
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(name);
	}
	public void printInfo(int age) {
		System.out.println(age);
	}
}	
class Student1 extends Student{	
	public void printInfo(String name,int age) {
		System.out.println(name+" "+age);
	}
	
}

public class Polymorphism {
	public static void main(String [] args) { 
		Student1 s1 = new Student1();
		s1.printInfo("ajay");
	}
}
