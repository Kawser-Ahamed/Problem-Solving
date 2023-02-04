package Contest_4;

import java.util.*;

public class Increasing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int count=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			
			for(int i=0;i<n-1;i++) {
				if(a[i]<a[i+1]) {
					count++;
				}
			}
			
			if(count == n-1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}

	}

}
