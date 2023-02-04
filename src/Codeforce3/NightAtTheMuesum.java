package Codeforce3;

import java.util.Scanner;

public class NightAtTheMuesum 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int total = 0;
		char in = 'a';
		char c = str.charAt(0);
		int f = in;
		int s = c;
		int div = Math.abs(Math.abs(f-s));

		if(div>13)
		{
			total+=26-div;
		}
		else
		{
			total+=div;
		}

		for(int i=0;i<str.length()-1;i++)
		{
		   
			f = str.charAt(i);
			s = str.charAt(i+1);
			div = Math.abs(f-s);
			if(div>13)
			{
				total+=(26-div);
			}
			else
			{
				total+=div;
			}
		}
		System.out.println(total);

	}

}
