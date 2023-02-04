package Contest6;

import java.util.*;

public class MainakAndArray 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0)
		{
			long n = sc.nextInt();
			int total = 0;
			Vector<Integer> vec = new Vector<Integer>();
			for(long i=0;i<n;i++) {
				vec.add(sc.nextInt());
			}
			total = Collections.max(vec)-Collections.min(vec);
			System.out.println(total);
			t--;
		}

	}

}
