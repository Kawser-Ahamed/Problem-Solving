package Codemarshal;

import java.util.Arrays;
import java.util.Scanner;

public class AMultipleOf17 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int s=0,s1=0,s2=0;
		int[]a = new int[3];
		
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		s = a[0]+a[1]+a[2];
		s1= a[0]*a[1]*a[2];
		s2= (a[0]+a[1])*a[2];
		
		System.out.println(Math.max(Math.max(s, s1),s2));

	}

}
