package CodeForce;

import java.util.Scanner;

public class IsItRated 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		
		int flag=0;
		int Count=0;
		int Count2=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<b[i] || a[i]>b[i])
			{
				flag=1;
			}
			
			if(a[i]==b[i])
			{
				Count++;
			}
			if(Count==a.length)
			{
				for(int j=1;j<a.length;j++)
				{
					if(a[j]<max || a[j]==max)
					{
						Count2++;
						max=a[j];
					}
				}
			}
		}
		
		
		if(Count2==a.length-1)
		{
			flag=3;
		}
		if(flag==1)
		{
			System.out.println("rated");
		}
		else if(flag==3)
		{
			System.out.println("maybe");
		}
		else
		{
			System.out.println("unrated");
		}

	}

}
