package CodeForce2;

import java.util.Scanner;

public class VaysaAndFence 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int h = sc.nextInt();
		int []a = new int[n];
		int total=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<=h)
			{
				total+=1;
			}
			else
			{
				total+=2;
			}
		}
		
		System.out.println(total);

	}

}
