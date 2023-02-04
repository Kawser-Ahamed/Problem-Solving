package CodechefContest2;

import java.util.Arrays;
import java.util.Scanner;

public class AvarageTest
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		
		while(t>0)
		{
			int []a = new int[3];
			int sum=0;
			for(int i=0;i<3;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
				
			for(int i=0;i<2;i++)
			{
				sum+=a[i];
			}
			int avg = sum/2;
			
			if(avg<35)
			{
				System.out.println("fail");
			}
			else
			{
				System.out.println("pass");
			}
			t--;
		}

	}

}
