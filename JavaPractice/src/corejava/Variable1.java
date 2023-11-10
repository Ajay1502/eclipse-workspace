package corejava;

public class Variable1 {
	//Instance variable
	String name;// A variable declared inside class but outside body of method is called instance variable.
	
	//Static variable
	static String empName;//A variable declared inside a class but outside body of method with static keyword.
	
	public static void main (String[]args) {
		
		//Local variable
		String empAdd;// A variable declared inside the body of the method is called Local variable.
		empAdd = "sambhajinagar";
		System.out.println(empAdd);
		
	}

}
