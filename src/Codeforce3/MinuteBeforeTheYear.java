package Codeforce3;

import java.util.Scanner;

public class MinuteBeforeTheYear {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			h=23-h;
			h*=60;
			m=60-m;
			
			System.out.println((h+m));
			
			t--;
		}

	}

}
