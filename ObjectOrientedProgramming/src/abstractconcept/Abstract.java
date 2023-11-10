package abstractconcept;

abstract class Animal{
	abstract void walk();
	public void eats() {
		System.out.println("Animal eats");
	}
}
class Horse extends Animal{
	public void walk() {
		System.out.println("walks on four legs");
	}
}
class Tiger extends Animal{
	public void walk() {
		System.out.println("tiger is run fast");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
		horse.eats();
		Tiger tiger = new Tiger();
		tiger.walk();
		
			
			
	}

}
