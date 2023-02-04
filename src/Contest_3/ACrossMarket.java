package Contest_3;

import java.util.*;

public class ACrossMarket 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n==1 && m==1)
			{
				System.out.println(0);
			}
			else
			{
				int ans = n+m-2;
				ans+= Math.min(n, m);
				System.out.println(ans);
			}
		}

	}

}
