package CodeForce2;

import java.util.*;

public class RequiredReminder 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t>0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			int n=sc.nextInt();
			Vector<Integer> vec = new Vector<Integer>();
			
			if(y==0 && x>n)
			{
				System.out.println(0);
			}
			else if(y==0 && x<n)
			{
				System.out.println(n-1);
			}
			else
			{
				for(int i=x;i<=n;i++)
				{
					if(i%x==y)
					{
						vec.add(i);
					}
				}	
				System.out.println(Collections.max(vec));
				
			}	
			t--;
		}

	}

}
