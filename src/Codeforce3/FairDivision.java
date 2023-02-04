package Codeforce3;

import java.util.Scanner;

public class FairDivision 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			int sum=0,div=0,flag=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				sum+=a[i];
			}
			
			if(sum%2==0)
			{
				div = sum/2;
				if(div%2==0)
				{
					flag=1;
				}
				else
				{
					for(int i=0;i<n;i++)
					{
						if(a[i]==1)
						{
							flag=1;
							break;
						}
						else
						{
							flag=0;
						}
					}
				}
			}
			else
			{
				flag=0;
			}
			
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
			
			t--;
		}

	}

}
