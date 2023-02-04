package Contest5;

import java.util.*;

public class ColurBlinds 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int c = sc.nextInt();
			String str = sc.next();
			String str2 =sc.next();
			int flag=0;
			
			for(int i=0;i<c;i++)
			{
				if(str.charAt(i)==str2.charAt(i))
				{
					flag=0;
				}
				else if((str.charAt(i)=='G' && str2.charAt(i)=='B') || (str.charAt(i)=='B' && str2.charAt(i)=='G'))
				{
					flag=0;
				}
				else
				{
					flag=1;
					break;
				}
			}
			
			if(flag==1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
			
			t--;
		}

	}

}
