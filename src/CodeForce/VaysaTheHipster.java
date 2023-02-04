package CodeForce;

import java.util.Scanner;

public class VaysaTheHipster 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int Count=0;
		int flag=0;
		
		while(a!=0 && b!= 0)
		{
			a--;
			b--;
			Count++;
		}
		
		if(a>=2)
		{
			while(a!=0)
			{
				a-=2;
				flag++;
			}
		}
		if(b>=2)
		{
			while(b!=0)
			{
				b-=2;
				flag++;
			}
		}
		
		System.out.println(Count+" "+flag);

	}

}
