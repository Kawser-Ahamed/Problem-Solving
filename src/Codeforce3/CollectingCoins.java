package Codeforce3;

import java.util.Scanner;

public class CollectingCoins 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();
			
			int sum = a+b+c+n;
			int div = sum/3;
			
			if(sum%3==0 && a<=div && b<=div && c<=div)
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
