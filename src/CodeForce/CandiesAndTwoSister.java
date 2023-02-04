package CodeForce;

import java.util.*;

public class CandiesAndTwoSister 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();		
		while(t>0)
		{
			int n = sc.nextInt();
			int Count=0;
			for(int i= n;i>=(n/2)+1;i--)
			{
				int a = i-1;
				int b =(n-a);
				
				if(a>b)
				{
					Count++;
				}
			}
			System.out.println(Count);
			t--;			
		}		
		
	}

}
