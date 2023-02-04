package CodeForce;

import java.util.Scanner;

public class SoldireAndBanana 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		
		int total=0;
		
		for(int i=1;i<=w;i++)
		{
			total+=k*i;
		}	
		int borrow;
		if(total<=n)
		{
			borrow=0;
		}
		else
		{
			borrow = total-n;
		} 
		System.out.println(borrow);
	}

}
