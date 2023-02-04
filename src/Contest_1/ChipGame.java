package Contest_1;

import java.util.Scanner;

public class ChipGame 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			int m=sc.nextInt();
			int n=sc.nextInt();
			
			if((m+n)%2==0)
			{
				System.out.println("Tonya");
			}
			else
			{
				System.out.println("Burenka");
			}
			t--;
		}

	}

}
