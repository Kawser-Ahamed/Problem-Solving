package Codeforce3;

import java.util.Scanner;

public class AddOddOrSubtractEven 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int Count =0;
			
			if(a<b)
			{
				int odd = b-a;
				Count++;
				if(odd%2!=1)
				{
					Count++;
				}
			}
			else if(a==b)
			{
				Count=0;
			}
			else if(a>b)
			{
				int even = a-b;
				Count++;
				if(even%2!=0)
				{
					Count++;
				}
			}
			System.out.println(Count);
			t--;
		}

	}

}
