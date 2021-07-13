import java.util.*;
 interface AccountDao
{
	public void addAnAccount(Account account);
	
	public void withDraw(int accountNumber,double amount);
	
	public double checkBalance(int BankAccountNumber);
	
	public void changePassword(int BankAccountNumber,int accountNumber,String oldPassword,String newPassword);
	
	public List<Account> viewAllAccounts();
	
	public void getAccountDetails(int accountNumber);
	
}
 class Account
 {
 		int accountNo;
 		double accountBalance;
 		String accountPassword;
 	
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
 
 
 
public class Day3Assignment2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Account> l  = new ArrayList<Account>();
		Account a1=new Account(120,20000,"245#45");
		Account a2=new Account(130,40000,"2lfdslkm45");
		Account a3=new Account(140,80000,"24,wndc");
		
		InMemoryAccountDaoImpl i=new InMemoryAccountDaoImpl();
		
		i.addAnAccount(a1);
		i.addAnAccount(a2);
		i.addAnAccount(a3);
		
		i.withDraw(120, 3000);
     double a1bal=   i.checkBalance(120);
      double a2bal=  i.checkBalance(130);
      
      System.out.println("Balance of account a1 :"+a1bal);
      System.out.println("Balance of account a2 :"+a2bal);
      System.out.println();
      
      i.changePassword(140, 140, "2lfdslkm45", "NAkul123");
      
      l=i.viewAllAccounts();
      
      System.out.println(l);
      
      System.out.println();
        i.getAccountDetails(120);
		
	}

}
