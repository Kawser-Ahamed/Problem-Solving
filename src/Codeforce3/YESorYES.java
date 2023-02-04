package Codeforce3;

import java.util.Scanner;

public class YESorYES 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			String str =sc.next();
			
			if(str.equalsIgnoreCase("YES"))
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}

	}

}
