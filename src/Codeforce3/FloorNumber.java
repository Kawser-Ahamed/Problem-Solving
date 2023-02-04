package Codeforce3;

import java.util.Scanner;

public class FloorNumber 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int a = sc.nextInt();
			int e = sc.nextInt();
			int f = 1;
			for(int i=3;i<=a;i+=e)
			{
				f++;
			}
			System.out.println(f);
			t--;
		}

	}

}
