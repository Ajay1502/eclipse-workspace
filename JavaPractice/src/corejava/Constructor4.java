package corejava;

public class Constructor4 {
	/* Constructor 
	 A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. 
	 It can be used to set initial values for object attributes. 																																												
	 
	 Rules to declared Constructor
	 # Constructor name and class name should be same.
     # Constructor not allow return type.
      NOTE : we can passed parameters (Primitive ,non-primitive ,objects)
 	 
 	 There are two types of constructor
 	 a. Default constructor (no-args constructor)
 	 A constructor is called "Default Constructor" when it doesn't have any parameter.
 	 
 	 b. Parameterized constructor
 	 A constructor which has a specific number of parameters is called a parameterized constructor.
	 */
	String nameString;
	int age;
	
	
	 // Default constructor (no-args constructor)
	 public Constructor4() {//constructor
		// this is a default constructor
		System.out.println("--");
	}
	public void defaultCon() {//method
		System.out.println("default constructor1");
	}
	//parameterize constructor
	public Constructor4(String a,int b) {//constructor
	nameString = a;	
	age = b ;
	}
	public void paraCon() {//method
		System.out.println("name -"+ nameString + " age -" + age);
	}
	
	public static void main (String[] args) {
		Constructor4 cocConstructor4 = new Constructor4();
		Constructor4 paraConstructor4 =new Constructor4("ajay",24);
		cocConstructor4.defaultCon();
		paraConstructor4.paraCon();
	}

}
/*
Here are some important points to note about constructors in Java:

Constructors are called automatically when an object of the class is created.
If a class does not have a constructor, Java provides a default constructor with no arguments.
If a class has one or more constructors, the default constructor is not automatically provided.
A constructor can be overloaded with different parameters to create objects with different initial values.
A constructor can call another constructor in the same class using the keyword "this". This is called constructor chaining.
A constructor can also call a constructor of its superclass using the keyword "super". This is called invoking a superclass constructor.
A constructor can have access modifiers (public, private, protected) to control its visibility.
Here's an example of a constructor in Java:

 */