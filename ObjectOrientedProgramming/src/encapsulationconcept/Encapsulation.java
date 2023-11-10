package encapsulationconcept;
import classandobjectconcept.ClassAndObject;
import objectorientedprogramming.*;
public class Encapsulation {
	public static void main(String[] args) {
	RBI bn = new RBI();
	bn.employee =100;
	System.out.println(bn.employee);
	bn.deposite();
	bn.withdraw();
	
	ClassAndObject vv = new ClassAndObject();
	vv.lastname ="Pande";
	System.out.print(vv.lastname);
	}
	
    
}