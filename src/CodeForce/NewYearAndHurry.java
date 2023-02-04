package CodeForce;

import java.util.Scanner;

public class NewYearAndHurry 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int Flag = k;
		int Count = 0;
		for(int i=1;i<=n;i++) 
		{
			Flag += 5*i;			
			if(Flag<=240)
			{
				Count++;
			}
		}
		
		System.out.println(Count);

	}

}
