package CodeForce;

import java.util.*;

public class ATram 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		Vector vec = new Vector();
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		int has = b[0];
		int max = has;
		vec.add(max);
		for(int i=1;i<n-1;i++)
		{
			has -= a[i];
			has += b[i];
			
			if(has>max)
			{
				max=has;
				vec.add(max);
			}
		}
		has -=a[n-1];	
		System.out.println(Collections.max(vec));
	}

}
