package flowcontrol;

public class LoopingStatement {

	public static void main(String[]args) {
		
		//for looping statement
		
		System.out.println("print seven table");
		for (int i = 1; i <= 10; i++) {
			System.out.println(7*i);
		}
		System.out.println("print tenth table");
		for(int i=1; i<=10; i++) {
			System.out.println(10*i);
		}
	
		
		// Do while looping statement
		
		System.out.println("print even number");
		 int i = 1;
		 do {
			System.out.println(2*i);
			i++;
		} while (i<=10);
		 
		System.out.println("print odd number");
		int a=1;
		do {
			System.out.println(2*a+1);
			a++;
		} while (a<=10);
		
		
		// while looping statement
		System.out.println("decraese eight table");
		int b=10;
		while(b>0) {
			System.out.println(8*b);
			b--;
		}
		System.out.println("decrease Three table");
		int c=10;
		while(c>0) {
			System.out.println(3*c);
			c--;
		}
	}
}
