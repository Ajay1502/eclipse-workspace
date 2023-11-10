package conditionalstatementpractice;

import java.util.Scanner;

public class ConditionalStatement {
	
	public static void main(String[]args) {
		ConditionalStatement cd= new ConditionalStatement();
		cd.ifStatement();
		cd.ifElseStatement();
		cd.ifLadder();
		cd.nestedIf();
	}
	
	public void ifStatement() {
		String car = "kia";
		if (car.contains("kia")) {
			System.out.println("your are selected kia");
		}
	}
	
	public void ifElseStatement() {
		String car1= "ford";
		if (car1.equalsIgnoreCase("ford")) {
			System.out.println("you are selected ford");
		}
		else {
			System.out.println("you are not selected ford");
		}
		
	}

	public void ifLadder(){
		Scanner sacScanner =new Scanner(System.in);
		System.out.println("select car name");
		String carname = sacScanner.nextLine();
	if (carname.contains("honda")) {
		System.out.println("you are selected honda");
	} else if (carname.contains("tata")) {
		System.out.println("you are selected tata");
	} else if (carname.contains("mahindra")) {
		System.out.println("you are selected mahindra");
	} else {
		System.out.println("please select correct car name");
	}
	
	
	}
	public void nestedIf() {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter fb email id");
		String emailid = scan.nextLine();
		System.out.println("please enter valid otp ");
		int otp = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("please enter pwd");
		String pwdString = scan1.nextLine();
		
		if (emailid.contains("Ajay33")) {
			if (otp>=1) {
				if (pwdString.contains("ajay8554")) {
					System.out.println("wait for opening account");
				}
				else {
					System.out.println("Something is wrong");
				}
			}
			else {
				System.out.println("Something is wrong");
			}
		}else {
			System.out.println("Something is wrong");
		}
		
	}
	
}
