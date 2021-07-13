class InvalidAmountException extends RuntimeException //isA - unchecked
{
	InvalidAmountException(String str) {
		super(str);
	}
}

class InsufficientFundException extends RuntimeException //isA - unchecked
{
	InsufficientFundException(String str) {
		super(str);
	}
}
public class JavaDay3Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int amount=2500;
			int balance=500;
			
			if(amount <0)
			{
				throw new InvalidAmountException("Amount is invalid");
			}
			else if(amount > balance)
			{
				throw new InsufficientFundException("The fund is insi=ufficient");
			}
			else
			{
				balance=balance-amount;
			}
			
			
		} 
		catch (InvalidAmountException e) 
		{
			System.out.println(e);
			// TODO: handle exception
		}
		catch(InsufficientFundException e)
		{
			System.out.println(e);
		}
		
	}

}
