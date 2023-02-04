package CodeForce2;

import java.util.*;

public class AGame 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int []b = new int[n];
		int Count=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]==b[j])
				{
					Count++;
				}
			}
		}
		
		System.out.println(Count);

	}

}
