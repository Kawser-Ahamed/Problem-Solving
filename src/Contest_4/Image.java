package Contest_4;

import java.util.*;

public class Image 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			Vector<Integer> vec = new Vector();
			int Count=0;
			String x = sc.next();
			String y = sc.next();
			String str = x.concat(y);
			StringBuffer buffer = new StringBuffer(str);
			
			for(int i=0;i<buffer.length()-1;i++)
			{
				for(int j=i+1;j<buffer.length();j++)
				{
					if(buffer.charAt(i)==buffer.charAt(j))
					{
						buffer.deleteCharAt(j);
					}
				}
			}
			for(int i=0;i<buffer.length()-1;i++)
			{
				for(int j=0;j<buffer.length();j++)
				{
					if(buffer.charAt(i)!=buffer.charAt(j))
					{
						Count++;
					}
				}
				vec.add(Count);
				Count=0;
			}
			System.out.println(Collections.min(vec));
			t--;
		}
		
		

	}

}
