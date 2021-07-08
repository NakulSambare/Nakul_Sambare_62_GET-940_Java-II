import java.util.*;
public class Java_Day1_Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int runs[]=new int[30];
		int rand=0;
		int totalRunsScored=0;
		int noOfZeros=0;
		int noOfOnes=0;
		int noOfTwos=0;
		int noOfThrees=0;
		int noOfFours=0;
		int noOfSixs=0;
		int strikeRate=0;
		for (int i = 0; i < runs.length; i++) 
		{
			rand = random.nextInt(7);
			
			runs[i]=rand;
		}
		for (int i = 0; i < runs.length; i++) 
		{
			totalRunsScored=totalRunsScored+runs[i];
			if(runs[i]==0) 
			{
				noOfZeros=noOfZeros+1;
			}
			else if(runs[i]==1) 
			{
				noOfOnes=noOfOnes+1;
			}
			else if(runs[i]==2) 
			{
				noOfTwos=noOfTwos+1;
			}
			else if(runs[i]==3) 
			{
				noOfThrees=noOfThrees+1;
			}
			else if(runs[i]==4) 
			{
				noOfFours=noOfFours+1;
			}
			else if(runs[i]==6) 
			{
				noOfSixs=noOfSixs+1;
			}
		}
		
		strikeRate=(totalRunsScored/30)*100;
		
		System.out.println("Total Runs Scores : "+totalRunsScored);
		System.out.println("Number of 0s      : "+noOfZeros);
		System.out.println("Number of 1s      : "+noOfOnes);
		System.out.println("Number of 2s      : "+noOfTwos);
		System.out.println("Number of 3s      : "+noOfThrees);
		System.out.println("Number of 4s      : "+noOfFours);
		System.out.println("Number of 6s      : "+noOfSixs);
		System.out.println("Strike Rate       : "+strikeRate);
		
		
	}

}
