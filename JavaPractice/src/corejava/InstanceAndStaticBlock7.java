package corejava;

public class InstanceAndStaticBlock7 {
	/*  Blocks
	 	Blocks there two types
	 	1.Instance block
	 	2.Static block
	 */	
	String name;
	
	 static {
		 System.out.println("This is static block");
	 }
	 
	
	public static void main(String[]args) {
		
		InstanceAndStaticBlock7 IS = new InstanceAndStaticBlock7(); 
		System.out.println("name = "+ IS.name);
		
	}
	{
		//instance block
		System.out.println("This is Instance block ");
	}
	{
		System.out.println("this is second instance block");
		name = "ajay";
	}
	
}

