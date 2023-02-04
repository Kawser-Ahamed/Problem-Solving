package CodeForce;

import java.util.*;

public class QueueAtSchool 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		String str = sc.next();
		char []a = str.toCharArray();

		for(int i=0;i<t;i++)
		{
			for(int j=0;j<str.length()-1;j++)
			{
				if(a[j]=='B' && a[j+1]=='G')
				{
					char temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					j++;
				}
			}
		}
		
		str = String.valueOf(a);
		System.out.println(str);
	}

}
