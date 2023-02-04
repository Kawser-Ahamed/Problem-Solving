package CodeForce;

import java.util.*;

public class AStoneOnATable 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		StringBuffer buffer = new StringBuffer(str);	
		int Count=0;
		
		for(int i=0;i<buffer.length()-1;i++)
		{
			for(int j=i+1;j<buffer.length();j++)
			{
				if(buffer.charAt(i)==buffer.charAt(j) && Math.abs(j-i)<=1)
				{
					buffer.deleteCharAt(j);
					j--;
					Count++;
				}
			}
		}
		System.out.println(Count);

	}

}
