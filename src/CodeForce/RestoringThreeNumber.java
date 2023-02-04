package CodeForce;

import java.util.*;

public class RestoringThreeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[4];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		
		for(int i=1;i<4;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		for(int i=0;i<4;i++)
		{
			if(a[i]<max)
			{
			   System.out.println(max-a[i]);
			}
		}
		
		

	}

}
