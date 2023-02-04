package Codeforce3;

import java.util.*;

public class CasimirStringSolitire 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			String str = sc.next();
			int a = 0;
			int b = 0;
			
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)=='A')
				{
					a++;
				}
				if(str.charAt(i)=='B')
				{
					b++;
				}
				if(str.charAt(i)=='C')
				{
					a++;
				}
			}
			if(a==b)
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
