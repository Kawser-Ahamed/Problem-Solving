package Codeforce3;

import java.util.Scanner;

public class SqureString 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			String str = sc.next();
			int len = str.length();
			String x = str.substring(0, len/2);
       		String y = str.substring(len/2, len);
       		if(x.equals(y))
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
