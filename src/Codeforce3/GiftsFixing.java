package Codeforce3;

import java.util.Scanner;

public class GiftsFixing 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			long []a = new long[n];
			long[]b = new long[n];

			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				b[i] = sc.nextInt();
			}
			
			long min1=a[0];
			long min2=b[0];
			
			for(int i=1;i<n;i++)
			{
				if(a[i]<min1)
				{
					min1=a[i];
				}
				if(b[i]<min2)
				{
					min2=b[i];
				}
			}
			
			long sum=0;
			for(int i=0;i<n;i++)
			{
				long d1 = a[i]-min1;
				long d2 = b[i]-min2;
				long m = Math.max(d1, d2);
				sum+=m;
			}
			
			System.out.println(sum);
			
			t--;
		}
		

	}

}
