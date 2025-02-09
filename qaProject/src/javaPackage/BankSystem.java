package javaPackage;

public class BankSystem implements PaymentInterface {

	BankSystem(String username,String password)
	{
		System.out.println("The username and password of app "+username+ " "+password);
	}
	
	int amt=4000;
	void deposit(int dep)
	{
		amt=amt+dep;
		System.out.println("The amount after deposit "+amt);
	}
	
	void withdraw(int wt)
	{
		amt=amt-wt;
		System.out.println("The amount after the withdraw "+amt);
	}
	
	int display()
	{
		return amt;
	}

	public static void main(String[] args) {
		//Create a object 
		BankSystem obj= new BankSystem("preeja12","1234");
		obj.deposit(1000);
		obj.withdraw(500);
		System.out.println("Display the amount in account"+obj.display());
	}

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accountAccess() {
		// TODO Auto-generated method stub
		
	}

}
