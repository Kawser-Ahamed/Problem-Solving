package CodeForce2;

import java.util.*;

public class Broze 
{

	public static void main(String[] args) 
	{
		Scanner  sc = new Scanner(System.in);
		
		String str = sc.next();
		String x = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.')
			{
				x = x.concat("0");
			}
			else
			{
				if(str.charAt(i+1)=='.')
				{
					x = x.concat("1");
					i++;
				}
				else
				{
					x = x.concat("2");
					i++;
				}
			}
		}
		
		System.out.println(x);

	}

}
