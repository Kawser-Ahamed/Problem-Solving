package Codeforce3;

import java.util.Scanner;

public class Lucky 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			String str = sc.next();
			String x = str.substring(0, 3);
			String y = str.substring(3, 6);
			int f = Integer.parseInt(x);
			int s = Integer.parseInt(y);
			int sum1=0;
			int sum2=0;
			
			while(f>0)
			{
				int rem=f%10;
				sum1+=rem;
				f=f/10;
			}
			while(s>0)
			{
				int rem=s%10;
				sum2+=rem;
				s=s/10;
			}
			
			if(sum1==sum2)
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
