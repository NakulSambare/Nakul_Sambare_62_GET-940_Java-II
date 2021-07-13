import java.util.List;
import java.util.*;

public class InMemoryAccountDaoImpl implements AccountDao{
	
	
	private static List<Account> bankAccount=new ArrayList<Account>();
	@Override
	public void addAnAccount(Account account) {
		// TODO Auto-generated method stub
		bankAccount.add(account);
	}

	@Override
	public void withDraw(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(Account ba:bankAccount) {
			if(ba.getAccountNo()==accountNumber)
			{
				if(ba.getAccountBalance()>=amount)
					System.out.println(amount+" withdrawn from account number "+accountNumber);
				else
					System.out.println("Insufficient Balance");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
		
	}

	@Override
	public double checkBalance(int BankAccountNumber) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(Account ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				return ba.getAccountBalance();
			}
		}
		return -999;
	}

	@Override
	public void changePassword(int BankAccountNumber,int accountNumber, String oldPassword, String newPassword) {
		boolean flag=true;
		for(Account ba:bankAccount) {
			if(ba.getAccountNo()==BankAccountNumber)
			{
				ba.setAccountPassword(newPassword);;
				System.out.println("Password Change Successful");
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
	}

	@Override
	public List<Account> viewAllAccounts() {
		// TODO Auto-generated method stub
		return bankAccount;
	}

	@Override
	public void getAccountDetails(int accountNumber) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(Account ba:bankAccount) {
			if(ba.getAccountNo()==accountNumber)
			{
				System.out.println(ba.getAccountNo()+" "+ba.getAccountPassword()+" "+
						ba.getAccountBalance());
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Account number invalid");
	}
	 
 }