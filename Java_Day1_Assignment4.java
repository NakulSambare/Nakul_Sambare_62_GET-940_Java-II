
class Account
{
	private	int accountNo;
	private	double accountBalance;
	private	String accountPassword;
	
	public static String bankName="HDFC";
	
	Account(){
		
	}
	
	Account(int accountNo,double accountBalance,String accountPassword)
	{
		this.accountNo=accountNo;
		this.accountBalance=accountBalance;
		this.accountPassword=accountPassword;
	}
	
	public void displayAccount() 
	{
		System.out.println("Bank name : "+bankName);
		System.out.println("Account No : "+accountNo);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Password : "+accountPassword);
	}
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
	
}
public class Java_Day1_Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1=new Account(1122,25000.2,"#@1234#");
		account1.displayAccount();
		
		Account account2=new Account();
		account2.setAccountNo(15224);
		account2.setAccountBalance(56000.5);
		account2.setAccountPassword("524@123");
		account2.displayAccount();
		

	}

}
