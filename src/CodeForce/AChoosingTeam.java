package CodeForce;

import java.util.Scanner;
import java.util.Vector;

public class AChoosingTeam 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		
		Vector vec = new Vector();
		
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=k;j++)
			{
				a[i]++;
			}
			
			if(a[i]<=5)
			{
				vec.add(a[i]);
			}
		}
		
		int l = vec.size()/3;

		System.out.println(l);
	}

}
