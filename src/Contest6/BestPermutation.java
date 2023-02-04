package Contest6;

import java.util.Scanner;

public class BestPermutation 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			if(n%2==0)
			{
				for(int i=2;i<n;i+=2)
				{
					System.out.print((i)+" "+(i-1)+" ");
				}
				System.out.println((n-1)+" "+n);
			}
			else
			{
				System.out.print(1+" ");
				for(int i=3;i<n;i+=2)
				{
					System.out.print((i)+" "+(i-1)+" ");
				}
				System.out.println((n-1)+" "+n);
			}
			
			t--;
		}

	}

}
