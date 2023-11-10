package corejava;

public class DataType2{
	/* Their are two types of data types 
	   a.Primitive data types 
	   Byte, Short, Int, Long, Float, Double, Boolean, Char.
	   	 - Their are eight primitive data type.
	     - Primitive data has a fixed size.
	   b. 	 data types 
	   String ,array
	  	 - Nonprimitive data has not fixed size. 
	 */
	
	public static void main (String [] args) {
		
		//Primitive data types
		//Boolean 
		boolean logoisdisplyed = true;//1 byte
		System.out.println(logoisdisplyed);
		boolean logoisnotdisplyed = false;//1 byte
		System.out.println(logoisnotdisplyed);
		
		//Numeric
		byte num = 127;//1 byte
		System.out.println(num);
		short num1 = 32600;//2 byte
		System.out.println(num1);
		int num2 = 100000 ; //4 byte
		System.out.println(num2);
		long num3 =1234567 ; //8 byte
		System.out.println(num3);
		
		//Decimal
		float deci = 10.8f;//4 byte
		System.out.println(deci);
		double deci1 = 10.4; //8 byte
		System.out.println(deci1);
		
		//character
		char name = 'a';//2 byte
		System.out.println(name);
		
		//Nonprimitive data type
		//String
		String name1="ajay";
		System.out.println(name1);
		
		//Array = It collection of similar type objects
		String [] nameFri = {"ajay","abhay","aadi","pavan"};
		System.out.println(nameFri[3]);
		System.out.println(nameFri[2]);
		System.out.println(nameFri[1]);
		System.out.println(nameFri[0]);
		
		
	}

}
