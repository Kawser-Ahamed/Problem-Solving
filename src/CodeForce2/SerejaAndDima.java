package CodeForce2;

import java.util.*;

public class SerejaAndDima 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int sum1=0,sum2=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		for(int i=0;i<n;i+=2)
		{
			sum1+=a[i];
		}
		for(int i=1;i<n;i+=2)
		{
			sum2+=a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(Math.max(sum1, sum2)+" "+Math.min(sum2, sum1));

	}

}
