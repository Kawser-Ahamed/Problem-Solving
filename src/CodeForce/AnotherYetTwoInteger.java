package CodeForce;

import java.util.Scanner;

public class AnotherYetTwoInteger 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int move=0;
			if(a<b)
			{
				while(a<b)
				{
					a+=10;
					move++;
				}
			}
			else
			{

				while(a>b)
				{
					a-=10;
					move++;
				}
			}
			System.out.println(move);
		}
		
		
	}

}
