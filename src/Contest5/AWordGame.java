package Contest5;

import java.util.*;

public class AWordGame 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			String a[] = new String[n];
			String b[] = new String[n];
			String c[] = new String[n];
			int Counta=0;
			int Countb=0;
			int Countc=0;
			
			for(int i=0;i<n;i++)
			{
				a[i]=sc.next();
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.next();
			}
			for(int i=0;i<n;i++)
			{
				c[i]=sc.next();
			}
				
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i].equals(c[j]))
					{
						Counta+=1;
					}
				}
				
			}

			System.out.println(Counta+" "+Countb+" "+Countc);

			
			
			
			t--;
		}

	}

}

//for(int j=0;j<n;j++)
//{
//	if(a[i].equals(b) && a[i].equals(c[j]))
//	{
//		Counta+=0;
//	}
//	else if(a[i].equals(b[j]) || a[i].equals(c[j]))
//	{
//		Counta+=1;
//	}
//	else
//	{
//		Counta+=3;
//	}
//	
//	if(b[i].equals(a[j]) && b[i].equals(c[j]))
//	{
//		Countb=0;
//	}
//	else if(b[i].equals(a[j]) || b[i].equals(c[j]))
//	{
//		Countb=1;
//	}
//	else
//	{
//		Countb=3;
//	}
//	
//	if(c[i].equals(a[j]) && c[i].equals(b[j]))
//	{
//		Countc=0;
//	}
//	else if(c[i].equals(a[j]) || c[i].equals(b[j]))
//	{
//		Countc=1;
//	}
//	else
//	{
//		Countc=3;
//	}
//
