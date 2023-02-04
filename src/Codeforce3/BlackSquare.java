package Codeforce3;

import java.util.Scanner;

public class BlackSquare 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[4];
		int sum=0;
		
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		
		String str = sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			String x = String.valueOf(str.charAt(i));
			int n = Integer.parseInt(x);
			sum+=a[n-1];
		}
		
		System.out.println(sum);

	}

}
