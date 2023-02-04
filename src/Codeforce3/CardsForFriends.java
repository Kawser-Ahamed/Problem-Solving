package Codeforce3;

import java.util.Scanner;

public class CardsForFriends 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			
			int w = sc.nextInt();
			int h = sc.nextInt();
			int n = sc.nextInt();
			int flag=1;
			int Count=1;
			
			if(n==1)
			{
				flag=1;
			}
			while(w%2==0)
			{
				Count*=2;
				w=w/2;
			}
			
			while(h%2==0)
			{
				Count*=2;
				h/=2;
			}
			if(n<=Count)
			{
				flag=1;
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
