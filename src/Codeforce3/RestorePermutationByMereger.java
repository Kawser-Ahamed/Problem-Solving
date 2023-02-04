package Codeforce3;

import java.util.*;

public class RestorePermutationByMereger 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int size = n*2;
			int a[] = new int[size];
			
			HashSet hash = new LinkedHashSet();
			
			for(int i=0;i<size;i++)
			{
				hash.add(sc.nextInt());
			}
			Iterator itr = hash.iterator();
			
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			System.out.println();
			t--;
		}

	}

}
