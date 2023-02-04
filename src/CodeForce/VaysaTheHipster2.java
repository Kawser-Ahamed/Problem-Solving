package CodeForce;

import java.util.Scanner;

public class VaysaTheHipster2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a>b)
		{
			System.out.print(b+" ");
		}
		else
		{
			System.out.println(a+" ");
		}
			int ans = Math.abs(a-b);
			System.out.println(ans/2);

	}

}
