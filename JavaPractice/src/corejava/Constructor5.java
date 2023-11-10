package corejava;

public class Constructor5 {
	 
	//Constructor overloading
	/*
	  Constructor overloading in Java is a technique of having more than one
	  constructor with different parameter lists. They are arranged in a way that
	  each constructor performs a different task. They are differentiated by the
	  compiler by the number of parameters in the list and their types.
	 */
	    int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    public Constructor5(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    public Constructor5(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	Constructor5 s1 = new Constructor5(111,"Karan");  
	    	Constructor5 s2 = new Constructor5(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
	  

}
