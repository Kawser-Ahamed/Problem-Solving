package CodeForce;

import java.util.Scanner;

public class PoliceAndCrime
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Occur=0;
		int Police=0;
		int Crime=0;
		
		int t[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			t[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(t[i]<0 && Police<=0)
			{
				Occur++;
			}
			else
			{			
				if(t[i]>0)
				{
					Police+=t[i];
				}
				else
				{
					Crime++;
					Police-=Crime;
					Crime=0;
				}
			}
			
			
				
		}
		
		System.out.println(Occur);

	}

}
