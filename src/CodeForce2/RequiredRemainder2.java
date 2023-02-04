package CodeForce2;

import java.util.Scanner;

public class RequiredRemainder2 
{

	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			
			int p = (n-y)/x;
			int k = p*x+y;
			
			System.out.println(k);
			
			t--;
		}

	}

}
