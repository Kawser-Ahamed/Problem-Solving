package CodechefContest1;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class TestCase2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		
		
		
		while(t>0)
		{
			int T=sc.nextInt();
			int a[]= new int[T];
			for(int i=0;i<T;i++)
			{
				a[i]=sc.nextInt();
			}
			String b=sc.next();
			Vector v = new Vector();
			for(int i=0;i<b.length();i++)
			{
				if(b.charAt(i)=='0')
				{
					v.add(a[i]);
				}		
			}
			
			System.out.println(Collections.min(v));
			t--;
		}

	}

}
