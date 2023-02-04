  package Codeforce3;

import java.util.Scanner;

public class BrainsPhoto 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		String a[][] = new String[r][c];		
		int flag=0;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j] = sc.next();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j].equals("C") || a[i][j].equals("M") || a[i][j].equals("Y"))
				{
					flag=1;
					break;
				}
			}
		}
		
		if(flag==1)
		{
			System.out.println("#Color");
		}
		else
		{
			System.out.println("#Black&White");
		}

	}

}
