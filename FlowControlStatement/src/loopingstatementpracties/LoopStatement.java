package loopingstatementpracties;

public class LoopStatement {

	public static void main (String[]args) {
		//for loop
		for(int i=10; i>=1; i--) {
			System.out.println(2*i);
		}
		System.out.println("-------------------------------");
		
		for (int i=10;i>=1;i--) {
			System.out.println(2*i+1);
		}
		System.out.println("-------------------------------");
		//Do while loop
		
		int a=10;
		do {
			System.out.println(4*a);
			a--;
		}while(a>=1);
		System.out.println("-------------------------------");
		int c=10;
		do {
			System.out.println(5*c);
			c--;
		}while(c>=1);
		
	}
}
