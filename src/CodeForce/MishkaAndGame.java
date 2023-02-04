package CodeForce;

import java.util.*;

public class MishkaAndGame 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int []a = new int[n];
			int []b = new int[n];
			int Count1=0;
			int Count2=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			
			for(int i=0;i<n;i++)
			{
				if(a[i]>b[i])
				{
					Count1++;
				}
				else if(a[i]<b[i])
				{
					Count2++;
				}
			}
			
			if(Count1>Count2)
			{
				System.out.println("Mishka");
			}
			else if(Count1<Count2)
			{
				System.out.println("Chris");
			}
			else
			{
				System.out.println("Friendship is magic!^^");
			}
			
		
	}

}
