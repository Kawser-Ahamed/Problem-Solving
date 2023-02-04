package Codeforce3;

import java.util.*;

public class MaximumIncrease 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		Vector<Integer> vec = new Vector<Integer>();
		int count=1;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
			{
				count++;
			}
			else if(a[i]<=a[i-1])
			{
				vec.add(count);
				count=1;
			}
		}
		vec.add(count);
        System.out.println(Collections.max(vec));
	}

}
