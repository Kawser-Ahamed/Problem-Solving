package CodeForce2;

import java.util.*;

public class Shovel 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int r = sc.nextInt();
		int Count=1;
		int sum=k;
		boolean x = true;
		while(x==true)
		{
			if(sum%10!=r && sum%10!=0)
			{
				sum+=k;
				Count++;
				x=true;
			}
			else
			{
				x=false;
			}
		}
		
		System.out.println(Count);
		
		

	}

}
