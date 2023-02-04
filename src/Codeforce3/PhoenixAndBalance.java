package Codeforce3;

import java.util.Scanner;

public class PhoenixAndBalance 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			int sum1=0;
			int sum2=0;
			int total=0;
			
			for(int i=1;i<=n;i++)
			{	
				a[i-1]= (int) Math.pow(2, i);
			}
			int pos = n/2;
			for(int i=0;i<pos-1;i++)
			{
				sum1+=a[i];
			}
			sum1+=a[n-1];
			
			for(int i=pos-1;i<n-1;i++)
			{
				sum2+=a[i];
			}
			total = sum1-sum2;
			System.out.println(total);	
			t--;
		}

	}

}
