package CodeForce6;

import java.util.*;

public class MinimumExtraction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long []a = new Long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			Arrays.sort(a);
			
			Long max = a[0];
			
			for(int i=1;i<n;i++) {
				max = Math.max(max, (a[i]-a[i-1]));
			}
			
			System.out.println(max);
			
			t--;
		}

	}

}
