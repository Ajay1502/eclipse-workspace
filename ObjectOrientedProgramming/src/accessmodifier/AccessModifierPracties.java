package accessmodifier;

class Bank{
	public String usename;
	protected String Gmail;
	private String Password;
	
	public String getPassword() {//getter method
		return this.Password;
	}
	public void setPassword(String pass) {//setter method ( we can access private variable and set  properties 
		this.Password = pass;
	}
}

public class AccessModifierPracties {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.usename = "akash123";
		System.out.println(bank.usename);
		bank.Gmail = "Akash123@gmail.com";
		System.out.println(bank.Gmail);
		bank.setPassword("12345");
		System.out.println(bank.getPassword());
		
	}

}
