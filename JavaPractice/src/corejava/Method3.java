package corejava;

public class Method3 {

	/* Method are two types.
	   a.static method 
	    The static method is based on the class.We can access static method with the reference of  className
	   
	   b. instance method 
	    The instance method is based on the object. we can access instance method by using object. 
	 */
	public static void main (String[]args) {
		Method3 asMethod3 = new Method3();
		MethodOverLoading3 m3 =new MethodOverLoading3();
		asMethod3.ins();
		Method3.sta();
		System.out.println(m3.addition(100, 20));
	}
	//instance method
	public void ins() {
		System.out.println("instance method");
	}
	// Static method
	public static void sta() {
		System.out.println("static method");
	}
}

