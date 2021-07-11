
class SbiAtm extends Account implements ATM  {

	@Override
	public void withdraw(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		
		accountBalance=accountBalance-amount;
		
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		accountPassword=newPassword;
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println(accountBalance);
	}
	
}

public class IciciAtm extends Account implements ATM{

	@Override
	public void withdraw(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance-amount;
		
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		accountPassword=newPassword;
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println(accountBalance);
	}

}

public class Java_Day2_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



