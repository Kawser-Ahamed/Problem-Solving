package CodeForce2;

import java.util.Scanner;

public class Drinks 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=a[i];
		}
		
		double x = (double)sum/n;
		System.out.printf("%,.10f",x);

	}

}
