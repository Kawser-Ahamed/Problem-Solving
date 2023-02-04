package Codeforce3;

import java.util.Scanner;

public class EqualCandies 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			int eat=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int min = a[0];
			
			for(int i=1;i<n;i++)
			{
				if(a[i]<min)
				{
					min = a[i];
				}
			}
			for(int i=0;i<n;i++)
			{
				eat += a[i]-min;
			}
			
			System.out.println(eat);
			
			t--;
		}

	}

}
