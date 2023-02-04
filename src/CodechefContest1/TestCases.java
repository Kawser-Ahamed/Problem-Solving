package CodechefContest1;

import java.util.Scanner;

public class TestCases 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		
		
		while(t>0)
		{
			int T=sc.nextInt();
			int a[]= new int[T];
			int c[]= new int[100];
			int len=0;
			for(int i=0;i<T;i++)
			{
				a[i]=sc.nextInt();
			}
			String b=sc.next();
			
			for(int i=0;i<b.length();i++)
			{
				if(b.charAt(i)=='0')
				{
					c[i]=a[i];
					len++;
				}		
			}
			
			int min=0;
			if(c[0]==0)
			{
				min=c[1];
				len+=1;
				for(int i=1;i<len;i++)
				{
					if(c[i]<min)
					{
						min=c[i];
					}
				}
			}
			else
			{
				min=c[0];
				for(int i=0;i<len;i++)
				{
					if(c[i]<min)
					{
						min=c[i];
					}
				}
			}
			System.out.println(min);
			t--;
		}

	}

}
