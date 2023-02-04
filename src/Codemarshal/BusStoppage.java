package Codemarshal;

import java.util.*;

public class BusStoppage 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int k=1;k<=t;k++)
		{
			int x = sc.nextInt();
			int n = x-1;
			Vector<Integer> vec = new Vector<Integer>();
			
			int a[] = new int[n];
			int b[] = new int[n];
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			
			vec.add(a[0]);
			int has = a[0];
			
			for(int i=1;i<n;i++)
			{
				has +=a[i];
				has -=b[i];
				vec.add(has);
			}
			System.out.println(vec);
			System.out.println("Case " +k+": "+Collections.max(vec));
		}

	}

}
