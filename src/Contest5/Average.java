package Contest5;

import java.util.*;

public class Average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long []a = new Long[n];
			Vector<Integer> vec = new Vector<Integer>();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			Long x = 1000000000L; 
			for(Long i=0L;i<x;i++) {
				vec.add(1);
			}
			
			for(Long i=2L;i<Math.sqrt(x);i++) {
				for(Long j=i*i;j<=x;j+=i) {
					
				}
			}
			
			
			t--;
		}

	}

}
