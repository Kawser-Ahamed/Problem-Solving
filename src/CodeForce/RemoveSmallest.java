package CodeForce;

import java.util.*;

public class RemoveSmallest 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			int Count=0;
			for(int i=0;i<n-1;i++)
			{
				if(Math.abs(a[i]-a[i+1])<=1)
				{			
					Count++;
				}
			}
			int flag=n-1;
			if(Count==flag)
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
