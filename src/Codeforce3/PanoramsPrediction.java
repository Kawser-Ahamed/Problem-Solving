package Codeforce3;

import java.util.Scanner;

public class PanoramsPrediction 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int prime=0;
		int flag=0;
		
		for(int i=n+1;i<=m;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}
			}
			if(flag==0)
			{
				prime=i;
				break;
			}
			
		}
		if(prime==m)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
