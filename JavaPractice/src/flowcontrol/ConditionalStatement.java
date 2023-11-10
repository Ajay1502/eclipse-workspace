package flowcontrol;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[]args) {
	//If statement
		String city ="sambhajiNagar";
	if (city.contains("sambhajiNagar")) {
		System.out.println("This is the best city");
	}
	String carName = "Honda";
	if (carName.contains("Honda")) {
		System.out.println("This is a best car");
	}
	
	//If Else Statement 
	String country ="india";
	if (country.equalsIgnoreCase("indiaa")) {
		System.out.println("candidate eligible for voter id");
	} else {
		System.out.println("candidate not eligible for voter id");
	}
	String name = "Ajay";
	if (name.equals("ajay")) {
		System.out.println("go to the next step");
	} else {
		System.out.println("Please enter correct name");
	}
	
	//Else If ladder
	Scanner scanner= new Scanner(System.in);
	System.out.println("please enter valid browser");
	String browser =scanner.nextLine();
	
	if (browser.contains("chrome")) {
		System.out.println("chrome browser is selected");
	}else if (browser.contains("firefox")) {
		System.out.println("firefox browser is selected");
	}else if (browser.contains("edge")) {
		System.out.println("edge browser is selected");
	}else {
		System.out.println("enter valid browser");
	}
	
	//Nested if
	Scanner scanner1 = new Scanner(System.in);
	System.out.println("Please enter you are Email ID");
	String Email = scanner1.nextLine();
	System.out.println("please enter otp");
	int otp = scanner1.nextInt();
	Scanner scanner2 =new Scanner(System.in);
	System.out.println("please enter your PWD");
	String pwd = scanner2.nextLine();
	
	if (Email.contains("pande90")) {
		if (otp>=5) {
			if (pwd.contains("ajay")) {
				System.out.println("Creating an account");
				}
				else {
				System.out.println("otp is correct");
				}
			    }
				else {
				System.out.println("emil is correct");
				}
	            }
				else {
				System.out.println("smoting is a wrong");
				
				}
	
	//Switch statement
	Scanner scanner3 = new Scanner(System.in);
	System.out.println("please enter valid data");
	String dataString = scanner3.nextLine();
	
	switch (dataString) {
	case "Ajay":{
		System.out.println(dataString + " name is a correct");
		break;	
	}
	case "Abhay":{
		System.out.println(dataString + " name is a correct");
		break;
	}
	case "Dipak":{
		System.out.println(dataString + " name is a correct");
		break;
	}

	default:
		System.out.println("enter correct name");
	}
	
			 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
