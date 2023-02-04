package CodeForce;

import java.util.*;

public class DoNotBeDistract 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n =sc.nextInt();
			String str = sc.next();
			StringBuffer buffer = new StringBuffer(str);
			int flag=1;
			for(int i=0;i<buffer.length()-1;i++)
			{
				for(int j=i+1;j<buffer.length();j++)
				{
					if(buffer.charAt(i)==buffer.charAt(j) && Math.abs(j-i)==1)
					{
						buffer.deleteCharAt(j);
						j--;
					}					
				}
				
			}
			
			for(int i=0;i<buffer.length()-1;i++)
			{
				for(int j=i+1;j<buffer.length();j++)
				{
					if(buffer.charAt(i)==buffer.charAt(j))
					{
						flag=0;
					}
				}
				
			}
			
			if(flag==1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}		
			t--;
		}

	}

}
