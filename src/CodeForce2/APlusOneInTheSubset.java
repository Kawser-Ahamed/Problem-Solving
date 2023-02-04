package CodeForce2;

import java.util.*;

public class APlusOneInTheSubset 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			int max =0;
			int round=0;
			int sum=0;
			boolean flag = false;
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
				if(a[i]>max)
				{
					max = a[i];
				}	
			}
			while(flag==false)
			{
				for(int i=0;i<n;i++)
				{
					if(a[i]<max)
					{
						a[i]+=1;
						
					}
					if(a[i]==max)
					{
						sum+=a[i];
						if(sum==max*n)
						{
							flag=true;
						}
					}
					
				}
				sum=0;
				
				round++;		
			}
			
			System.out.println(round);
			
			
			
			  t--;
				
			}

		}

	}


