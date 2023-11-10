package corejava;

public class MethodOverLoading3 {
	 
	
		int age;
		int bage;
		int cage;
		 
	
		
		public int addition(int a,int b) {
			age= a;
			bage=b;
			return a+b;
		}
		public int addition(int a, int b,int c) {
			age = a;
			bage = b;
			cage = c;
			return a+b+c;
		}
}
