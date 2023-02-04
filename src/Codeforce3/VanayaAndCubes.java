package Codeforce3;

import java.util.Scanner;

public class VanayaAndCubes 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int cube = sc.nextInt();
		int n=1;
		int i=1;
		int Count=0;
		
		while(cube>=n)
		{
			cube-=n;
			Count++;
			i++;
			n+=i;
		}
		
		System.out.println(Count);

	}

}
