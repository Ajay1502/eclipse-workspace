package corejava;

public class InstanceAndStaticArea6 {
	
	public static void main(String[]args) {
		//Static area
		InstanceAndStaticArea6 in = new InstanceAndStaticArea6();
		in.instance();
		System.out.println("static area");
		
	}
	//instance area
	public void instance(){
		System.out.println("Instance area");
	}
	

}
