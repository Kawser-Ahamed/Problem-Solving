package Contest6;

import java.util.Scanner;

public class ColouredBalls 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int max = a[0];
			int rem =1;
			for(int i=0;i<n;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
					rem = i+1;
				}
			}
			System.out.println(rem);
			t--;
		}

	}

}
