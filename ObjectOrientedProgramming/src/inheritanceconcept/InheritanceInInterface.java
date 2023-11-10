package inheritanceconcept;

interface Animal2{
	void walk();
}
interface pets{ 
	void eats();
}
//Interfaces support the functionality of multiple inheritance.

class Dog implements Animal2,pets{

	@Override
	public void walk() {
		System.out.println("walk on four legs");
		
	}

	@Override
	public void eats() {
		System.out.println("dog eats pedigree");
		
	}
	
}
public class InheritanceInInterface {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eats();
		dog.walk();

	}

}
