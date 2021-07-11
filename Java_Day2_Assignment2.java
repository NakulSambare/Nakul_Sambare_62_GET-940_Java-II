
abstract class Account2{
	public abstract void withdraw(int amount);
}
class SavingAccount1 extends Account2
{
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public static String bankName="HDFC";
	int accountNo;
	double accountBalance;
	String accountPassword;
	public int getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	int minimumBalance;
	public void displayAccount() 
	{
		System.out.println("Bank name : "+bankName);
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Password : "+accountPassword);
		System.out.println("Minimum Balance : "+minimumBalance);
	}
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance-amount;
		System.out.println("Account Balance : "+accountBalance);
		
	}
	
}
class CurrentAccount1 extends Account2
{
	public static String bankName="HDFC";
	int accountNo;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	double accountBalance;
	String accountPassword;
	int overDraftLimit;
	public int getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(int overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public void displayAccount() 
	{
		System.out.println("Bank name : "+bankName);
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Password : "+accountPassword);
		System.out.println("OverDraft Limit : "+overDraftLimit);
	}
	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		accountBalance=accountBalance-amount;
		System.out.println("Account Balance : "+accountBalance);
		
	}
	
	
}
public class Java_Day2_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount1 s=new SavingAccount1();
		s.setAccountBalance(100000);
		s.setAccountNo(102);
		s.setAccountPassword("1258468");
		s.setMinimumBalance(5000);
		s.displayAccount();
		s.withdraw(500);
		System.out.println();
		CurrentAccount1 c=new CurrentAccount1();
		c.setAccountBalance(150000);
		c.setAccountNo(103);
		c.setAccountPassword("125#45");
		c.setOverDraftLimit(500000);
		c.displayAccount();
		c.withdraw(5000);
		
	}

}
