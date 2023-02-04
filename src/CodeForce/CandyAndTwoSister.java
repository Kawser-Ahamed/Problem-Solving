package CodeForce;

import java.util.Scanner;

public class CandyAndTwoSister {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int Count=0;
			if(n==1 || n==2)
			{
				Count=0;
			}
			else
			{
				Count = (n-1)/2;
			}
			System.out.println(Count);
			t--;			
		}		

	}

}
