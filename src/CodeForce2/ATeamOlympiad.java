package CodeForce2;

import java.util.*;

public class ATeamOlympiad 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int Count1=0,Count2=0,Count3=0,Team=0,Found1=0,Found2=0,Found3=0,team=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]==1)
			{
				Count1++;
			}
			else if(a[i]==2)
			{
				Count2++;
			}
			else
			{
				Count3++;
			}
		}
		if(Count1==0 || Count2==0 || Count3==0)
		{
			System.out.println(Team);
		} 
		else
		{
			Team=Math.min(Math.min(Count1, Count2),Count3);
			int r=Team;
			System.out.println(Team);
				for(int i=0;i<n;i++)
				{
					if(a[i]>0)
					{
						if(Found1==0)
						{
							if(a[i]==1)
							{
								System.out.print(i+" ");
								a[i]=-1;
								Found1=1;
								team++;
							}
						}
						if(Found2==0)
						{
							if(a[i]==2)
							{
								System.out.print(i+" ");
								a[i]=-1;
								Found2=1;
								team++;
							}
						}
						if(Found3==0)
						{
							if(a[i]==3)
							{
								System.out.print(i+" ");
								a[i]=-1;
								Found3=1;
								team++;
							}
						}
						
						if(team%3==0)
						{
							Found1=0;
							Found2=0;
							Found3=0;
							i=0;
						}
					}
					
				}	
		}
		
		
	}

}
