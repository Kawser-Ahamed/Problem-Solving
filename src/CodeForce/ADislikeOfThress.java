package CodeForce;

import java.util.*;

public class ADislikeOfThress 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int k = sc.nextInt();
			Vector<Integer> vec = new Vector();
			for(int i=1;i<=k;i++)
			{
				if(i%3==0 || i%10==3)
				{
					k++;
				}
				else
				{
					vec.add(i);
				}
			}
			System.out.println(vec.lastElement());	
			t--;
		}

	}

}
