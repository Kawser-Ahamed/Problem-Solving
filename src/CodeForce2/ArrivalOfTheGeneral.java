package CodeForce2;

import java.util.*;

public class ArrivalOfTheGeneral 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a  = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		
		int MaxIndex = 0;
		int MinIndex = 0;
		
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				MaxIndex = i;
			}	
			if(min>=a[i])
			{
				min=a[i];
				MinIndex = i;
			}	
		}
		
		int maxdis = MaxIndex-0;
		int mindis = (n-1)-MinIndex;
		int total =0;
		if(MaxIndex > MinIndex)
		{
			total = (maxdis+mindis)-1;
		}
		else
		{
			total = (maxdis+mindis);
		}
		
		System.out.println(total);

	}

}
