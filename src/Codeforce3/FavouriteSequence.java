package Codeforce3;

import java.util.*;

public class FavouriteSequence 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int []a = new int[n];
			int j=1;
            Vector<Integer> vec = new Vector<Integer>();
            
            
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n/2;i++)
			{
				vec.add(a[i]);
				vec.add(a[n-j]);
				j++;
			}
			
			if(n%2==1)
			{
				vec.add(a[(n/2)]);
			}
			
			Iterator itr = vec.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			t--;
		}
			

	}

}
