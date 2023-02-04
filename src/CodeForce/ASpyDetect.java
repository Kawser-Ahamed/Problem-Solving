package CodeForce;

import java.util.*;

public class ASpyDetect 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			int Count=0;
			int Index=0;
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i]!=a[j])
					{
						Count++;
					}		
				}				
				if(Count==(n-1))
				{
					Index = i+1;
					break;
				}
				else
				{
					Count=0;
				}
			}
			System.out.println(Index);
			
			t--;
		}

	}

}
