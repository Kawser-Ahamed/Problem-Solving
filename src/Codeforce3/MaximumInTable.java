package Codeforce3;

import java.util.Scanner;

public class MaximumInTable 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=1;
		}
		
		for(int l=1;l<n;l++)
		{
			a[0]=1;
			for(int i=1;i<n;i++)
			{
				a[i]=a[i]+a[i-1];
			}
		}
		
		System.out.println(a[n-1]);

	}

}
