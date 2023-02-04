package Codeforce3;

import java.util.Scanner;

public class OddSet 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n*2];
			int odd = 0;
			int even = 0;
			for(int i=0;i<n*2;i++)
			{
				a[i]=sc.nextInt();
				
				if(a[i]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
			
			if(even==odd)
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
