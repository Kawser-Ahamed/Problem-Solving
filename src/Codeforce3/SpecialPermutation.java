package Codeforce3;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SpecialPermutation 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			System.out.print(n+" ");
			for(int i=0;i<n-1;i++)
			{
				System.out.print((i+1)+" ");
			}
			System.out.println();
			t--;
	   }

	}

}
