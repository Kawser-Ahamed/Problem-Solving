package CodeForce;

import java.util.Scanner;

public class NewYearParty 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp;
		if((a>b && a<c) || (a<b && a>c))
		{
			temp = a;
		}
		else if((b>a && b<c) || (b<a && b>c))
		{
			temp=b;
		}
		else
		{
			temp=c;
		}

		int sum = Math.abs(temp-a)+Math.abs(temp-b)+Math.abs(temp-c);
		
		System.out.println(sum);
		
	}

}
