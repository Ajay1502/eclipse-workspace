package stringandconstructorconcept;

public class ExampleConstructor {
	
		   String name;
		   int empage;

			/* Default constructor
			   public ExampleConstructor() { 
			   .super() }
			 */
		   //Constructor (Zero argument)
		  public ExampleConstructor(){
	      this.name = "BeginnersBook.com";
		   }
		  //Constructor with parameters
		  public ExampleConstructor(int age){
			  this.empage = age;
			  
		  }
		   public static void main(String[] args) {
			   ExampleConstructor obj = new ExampleConstructor();
		      System.out.println(obj.name);
		      ExampleConstructor exampleConstructor = new ExampleConstructor(23);
		      System.out.println(exampleConstructor.empage);
		   }
		
}
