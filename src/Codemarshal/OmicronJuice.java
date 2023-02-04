package Codemarshal;

import java.util.*;

public class OmicronJuice 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=t;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			sum+=(a+b+c);
			
			if(sum%3==0)
			{
				System.out.println("Case "+i+": Peaceful");
			}
			else
			{
				System.out.println("Case "+i+": Fight");
			}
			sum=0;
		}

	}

}
