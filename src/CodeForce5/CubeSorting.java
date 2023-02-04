package CodeForce5;

import java.util.*;

public class CubeSorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long []a = new Long[n];
			int flag=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			for(int i=1;i<n;i++) {
				if(a[i]>=a[i-1]) {
					flag=1;
					break;
				}
			}

			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("No");
			}
			
			String str;
			t--;
		}

	}

}
