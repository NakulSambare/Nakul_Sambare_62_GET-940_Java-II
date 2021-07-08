import java.util.*;
public class Java_Day1_Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int runsOfMatch1[]=new int[30];
		int runsOfMatch2[]=new int[30];
		int runsOfMatch3[]=new int[30];
		int runsOfMatch4[]=new int[30];
		int runsOfMatch5[]=new int[30];
		
		int totalOfMatch1=0;
		int totalOfMatch2=0;
		int totalOfMatch3=0;
		int totalOfMatch4=0;
		int totalOfMatch5=0;
		int noOfZeros[]=new int[5];
		int noOfOnes[]=new int[5];
		int noOfTwos[]=new int[5];
		int noOfThrees[]=new int[5];
		int noOfFours[]=new int[5];
		int noOfSixs[]=new int[5];
		Random random = new Random();
		int totalRuns=0;
		for (int i = 0; i < runsOfMatch1.length; i++)
		{
			int rand = random.nextInt(7);
			runsOfMatch1[i]=rand;
			totalOfMatch1=totalOfMatch1+runsOfMatch1[i];
			if(runsOfMatch1[i]==0) 
			{
				noOfZeros[0]=noOfZeros[0]+1;
			}
			else if(runsOfMatch1[i]==1) 
			{
				noOfOnes[0]=noOfOnes[0]+1;
			}
			else if(runsOfMatch1[i]==2) 
			{
				noOfTwos[0]=noOfTwos[0]+1;
			}
			else if(runsOfMatch1[i]==3) 
			{
				noOfThrees[0]=noOfThrees[0]+1;
			}
			else if(runsOfMatch1[i]==4) 
			{
				noOfFours[0]=noOfFours[0]+1;
			}
			else if(runsOfMatch1[i]==6) 
			{
				noOfSixs[0]=noOfSixs[0]+1;
			}
		}
		for (int i = 0; i < runsOfMatch2.length; i++) 
		{
			int rand = random.nextInt(7);
			runsOfMatch2[i]=rand;
			totalOfMatch2=totalOfMatch2+runsOfMatch2[i];
			if(runsOfMatch1[i]==0) 
			{
				noOfZeros[1]=noOfZeros[1]+1;
			}
			else if(runsOfMatch1[i]==1) 
			{
				noOfOnes[1]=noOfOnes[1]+1;
			}
			else if(runsOfMatch1[i]==2) 
			{
				noOfTwos[1]=noOfTwos[1]+1;
			}
			else if(runsOfMatch1[i]==3) 
			{
				noOfThrees[1]=noOfThrees[1]+1;
			}
			else if(runsOfMatch1[i]==4) 
			{
				noOfFours[1]=noOfFours[1]+1;
			}
			else if(runsOfMatch1[i]==6) 
			{
				noOfSixs[1]=noOfSixs[1]+1;
			}
		}
		for (int i = 0; i < runsOfMatch3.length; i++) 
		{
			int rand = random.nextInt(7);
			runsOfMatch3[i]=rand;
			totalOfMatch3=totalOfMatch3+runsOfMatch3[i];
			if(runsOfMatch1[i]==0) 
			{
				noOfZeros[2]=noOfZeros[2]+1;
			}
			else if(runsOfMatch1[i]==1) 
			{
				noOfOnes[2]=noOfOnes[2]+1;
			}
			else if(runsOfMatch1[i]==2) 
			{
				noOfTwos[2]=noOfTwos[2]+1;
			}
			else if(runsOfMatch1[i]==3) 
			{
				noOfThrees[2]=noOfThrees[2]+1;
			}
			else if(runsOfMatch1[i]==4) 
			{
				noOfFours[2]=noOfFours[2]+1;
			}
			else if(runsOfMatch1[i]==6) 
			{
				noOfSixs[2]=noOfSixs[2]+1;
			}
		}
		for (int i = 0; i < runsOfMatch4.length; i++) 
		{
			int rand = random.nextInt(7);
			runsOfMatch4[i]=rand;
			totalOfMatch4=totalOfMatch4+runsOfMatch4[i];
			if(runsOfMatch1[i]==0) 
			{
				noOfZeros[3]=noOfZeros[3]+1;
			}
			else if(runsOfMatch1[i]==1) 
			{
				noOfOnes[3]=noOfOnes[3]+1;
			}
			else if(runsOfMatch1[i]==2) 
			{
				noOfTwos[3]=noOfTwos[3]+1;
			}
			else if(runsOfMatch1[i]==3) 
			{
				noOfThrees[3]=noOfThrees[3]+1;
			}
			else if(runsOfMatch1[i]==4) 
			{
				noOfFours[3]=noOfFours[3]+1;
			}
			else if(runsOfMatch1[i]==6) 
			{
				noOfSixs[3]=noOfSixs[3]+1;
			}
		}
		for (int i = 0; i < runsOfMatch5.length; i++) 
		{
			int rand = random.nextInt(7);
			runsOfMatch5[i]=rand;
			totalOfMatch5=totalOfMatch4+runsOfMatch5[i];
			if(runsOfMatch1[i]==0) 
			{
				noOfZeros[4]=noOfZeros[4]+1;
			}
			else if(runsOfMatch1[i]==1) 
			{
				noOfOnes[4]=noOfOnes[4]+1;
			}
			else if(runsOfMatch1[i]==2) 
			{
				noOfTwos[4]=noOfTwos[4]+1;
			}
			else if(runsOfMatch1[i]==3) 
			{
				noOfThrees[4]=noOfThrees[4]+1;
			}
			else if(runsOfMatch1[i]==4) 
			{
				noOfFours[4]=noOfFours[4]+1;
			}
			else if(runsOfMatch1[i]==6) 
			{
				noOfSixs[4]=noOfSixs[4]+1;
			}
		}
		
		totalRuns=totalOfMatch1+totalOfMatch2+totalOfMatch3+totalOfMatch4+totalOfMatch5;
		
		int TotalnoOfZeros=0;
		int TotalnoOfOnes=0;
		int TotalnoOfTwos=0;
		int TotalnoOfThrees=0;
		int TotalnoOfFours=0;
		int TotalnoOfSixs=0;
		for (int i = 0; i < noOfZeros.length; i++) {
			TotalnoOfZeros=TotalnoOfZeros+noOfZeros[i];
			TotalnoOfOnes=TotalnoOfOnes+noOfOnes[i];
			TotalnoOfTwos=TotalnoOfTwos+noOfTwos[i];
			TotalnoOfThrees=TotalnoOfThrees+noOfThrees[i];
			TotalnoOfFours=TotalnoOfFours+noOfFours[i];
			TotalnoOfSixs=TotalnoOfSixs+noOfSixs[i];
		}
		int averageStrikeRate=(totalRuns/(30*5))*100;
		System.out.println("Total Runs in 5 innings : "+totalRuns);
		System.out.println("Number of 0s      : "+TotalnoOfZeros);
		System.out.println("Number of 1s      : "+TotalnoOfOnes);
		System.out.println("Number of 2s      : "+TotalnoOfTwos);
		System.out.println("Number of 3s      : "+TotalnoOfThrees);
		System.out.println("Number of 4s      : "+TotalnoOfFours);
		System.out.println("Number of 6s      : "+TotalnoOfSixs);
		System.out.println("Average Strike Rate: "+averageStrikeRate);
	}

}
