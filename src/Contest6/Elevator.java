package Contest6;

import java.util.Scanner;

public class Elevator 
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
			int first =0;
			int second =0;
			if(a==1)
			{
				System.out.println(1);
			}
			else
			{
				first = a-1;
				second =0;
				if(b>c)
				{
					second = b-1;
				}
				else
				{
					second = c-b;
					second+= c-1;
				}
				
				if(first<second)
				{
					System.out.println(1);
				}
				else if(first == second)
				{
					System.out.println(3);
				}
				else
				{
					System.out.println(2);
				}
			}
			
			t--;
		}

	}

}
