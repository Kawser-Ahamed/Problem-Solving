package Contest_1;

import java.util.Scanner;

public class MathematicalCircus 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		
		while(t>0)
		{
			int n=sc.nextInt();
			int k = sc.nextInt();
			int Count=0;
				
				for(int i=1;i<=n;i+=2)
				{
					int a=i;
					int b=i+1;
					
					if((a+k)*b%4==0)
					{
						Count++;			
					}
					else if((b+k)*a%4==0)
					{
						Count++;
					}
				}
				
				if(Count ==n/2)
				{
					System.out.println("YES");
					for(int i=1;i<=n;i+=2)
					{
						int a=i;
						int b=i+1;
						
						if((a+k)*b%4==0)
						{
							System.out.println(a+" "+b);			
						}
						else if((b+k)*a%4==0)
						{
							System.out.println(b+" "+a);
						}
					}
					
				}
				else
				{
					System.out.println("NO");
				}
				t--;
			}
			
	  }

	}


