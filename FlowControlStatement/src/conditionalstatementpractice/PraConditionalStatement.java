package conditionalstatementpractice;

import java.util.Scanner;

public class PraConditionalStatement {

	public static void main(String[]args) {
		PraConditionalStatement  pra = new PraConditionalStatement();
		pra.ifLadder();
		pra.nestedIf();
		
		String empNameString = "Ajay";
		if(empNameString.contains("Ajay")) {
			System.out.println("Empolyees name has correct");
		}
		
		if(empNameString.contains("ajay")) {
			System.out.println("Employees name has Correct");
		}else {
			System.out.println("Employees name has wrong");
		}
	}
	
	public void ifLadder() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Write correct name");
		String empName = scanner.nextLine();
		
		if(empName.contains("Ajay")) {
			System.out.println("Empolyees name has correct");
		}else if(empName.contains("Abhay")) {
			System.out.println("Empolyees name has correct");
		}else if(empName.contains("Dipak")) {
			System.out.println("Empolyees name has correct");
		}else {
			System.out.println(" enter correct name");
		}
	}
	
	public void nestedIf () {
		Scanner scan1 =new Scanner(System.in);
		System.out.println("enter employees name");
		String empNameString = scan1.nextLine();
		System.out.println("enter employee last name");
		String empLastNameString = scan1.nextLine();
		System.out.println("enter city name");
		String empCityName = scan1.nextLine()
;		
		if(empNameString.contains("ajay")) {
			if(empLastNameString.contains("pande")) {
				if(empCityName.contains("sambhajinagar")) {
					System.out.println("employees account has created");
				}else {
					System.out.println("something is missing");
				}
			}else {
				System.out.println("something is missing");
			}
		}else {
			System.out.println("something is missing");
		}
	}
}
