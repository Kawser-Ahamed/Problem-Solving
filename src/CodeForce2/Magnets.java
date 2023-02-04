package CodeForce2;

import java.util.*;

public class Magnets 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int Count=0;
		int last;
		int first;
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			last = a[i]%10;
			first = a[i+1];
			
			if(first==10)
			{
				while(first>=10)
				{
					first = a[i+1]/10;
				}
			}
			else
			{
				while(first>0)
				{
					first = a[i+1]/10;
				}	
			}
			
			if(first==last)
			{
				Count++;
			}
		}	
			
		System.out.println(Count+1);
		
		

	}

}
