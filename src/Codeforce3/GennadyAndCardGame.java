package Codeforce3;

import java.util.Scanner;

public class GennadyAndCardGame 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = str.charAt(0);
		char d = str.charAt(1);
		String a[] = new String[5];
		int flag=0;
		
		for(int i=0;i<5;i++)
		{
			a[i]=sc.next();
			char e = a[i].charAt(0);
			char f = a[i].charAt(1);
			
			if(c==e || d==f)
			{
				flag=1;
			}
		}
		
		if(flag==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}
