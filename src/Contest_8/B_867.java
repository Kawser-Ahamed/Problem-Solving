package Contest_8;

import java.util.*;

public class B_867 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			Long []a = new Long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			Arrays.sort(a);
			
			if(a[0]*a[1]>a[a.length-1]*a[a.length-2]) {
				System.out.println(a[0]*a[1]);
			}
			else {
				System.out.println(a[a.length-1]*a[a.length-2]);
			}
		}
		
		
		
		sc.close();

	}

}
