package classandobjectconcept;



class Pen{//Class
	public String colour;
	String type;
	
	public void write() {
		System.out.println("writing something");
	}
	public void printColour() {
		System.out.println(this.colour);
		System.out.println(this.type);
	}
	public Pen(){//constructor (zero argument)
		System.out.println("Constructor called");
	}
	public Pen(String colour, String type) {//constructor with parameterize
		this.colour = colour;
		this.type = type;
	}
}

public class ClassAndObject {//Object
	public String lastname;
	public static void main(String [] args) {
		Pen pen = new Pen();
		pen.colour = "red";
		pen.type ="ballpen";
		
		Pen pen2 = new Pen("blue","gelpen");
		
		pen.printColour();
		pen2.printColour();
		
	  
		
		
	}
}
