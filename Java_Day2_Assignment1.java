class SavingAccount extends Account
{
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
	
}
class CurrentAccount extends Account
{
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
	
	
}
public class Java_Day2_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s=new SavingAccount();
		s.setAccountBalance(100000);
		s.setAccountNo(102);
		s.setAccountPassword("1258468");
		s.setMinimumBalance(5000);
		s.displayAccount();
		System.out.println();
		CurrentAccount c=new CurrentAccount();
		c.setAccountBalance(150000);
		c.setAccountNo(103);
		c.setAccountPassword("125#45");
		c.setOverDraftLimit(500000);
		c.displayAccount();
		
		
	}

}
