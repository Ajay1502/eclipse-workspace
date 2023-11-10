package abstractconcept;

interface Animal1{
	public void walk();
}
class Lion implements Animal1{

	@Override
	public void walk() {
		System.out.println("walk on  four legs");
		
	}
	
}

public class Abstract1 {
	public static void main(String[]args) {
		Lion lion = new Lion();
		lion.walk();
	}
}
