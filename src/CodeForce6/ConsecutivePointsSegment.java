package CodeForce6;

import java.util.*;

public class ConsecutivePointsSegment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long a[] = new Long[n];	
				
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			if((a[n-1]-a[0]>n+1)) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			t--;
		}
		
		

	}

}
