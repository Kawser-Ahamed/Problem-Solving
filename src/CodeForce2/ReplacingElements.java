package CodeForce2;

import java.util.*;

public class ReplacingElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int d = sc.nextInt();
			int []a = new int[n];
			int flag=0;
			int count=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			
			int sum = a[0]+a[1];
			
			for(int i=0;i<n;i++) {
				if(a[i]<=d) {
					count++;
				}
			}
			
			if(count==n) {
				flag=1;
			}
			else {
				if(sum<=d) {
					flag=1;
				}
				else {
					flag=0;
				}
			}
			
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}

	}

}
