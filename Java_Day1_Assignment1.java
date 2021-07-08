import java .util.*;
public class Java_Day1_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numberOfUnits;
		double billAmount=0.0;
		System.out.println("Enter the number of units ");
		numberOfUnits=in.nextInt();
		if(numberOfUnits < 100)
		{
			billAmount=numberOfUnits*1.20;
		}
		else if(numberOfUnits <= 300 && numberOfUnits >=100)
		{
			int restUnit=numberOfUnits-100;
			billAmount=(restUnit*2)+(100*1.20);
		}
		else if(numberOfUnits > 300)
		{
			int restUnit2=numberOfUnits-100;//*2
			int restUnit3=numberOfUnits-300;//*3
			billAmount=(restUnit2*2)+(100*1.20)+(restUnit3*3);
		}
		
		System.out.println("The total Bill amount : "+billAmount);
		
		
	}

}
