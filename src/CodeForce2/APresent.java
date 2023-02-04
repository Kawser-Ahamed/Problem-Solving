package CodeForce2;

import java.util.*;

public class APresent 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[j]==i)
				{
					System.out.print(j+1+" ");
				}
			}
		}


	}

}
