package CodeForce;

import java.util.*;

public class AHolidayEquality 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		int Count =0;
		for(int i=0;i<n;i++)
		{
			while(a[i]!=max)
			{
				a[i]++;
				Count++;
			}
		}
		
		System.out.println(Count);

	}

}
