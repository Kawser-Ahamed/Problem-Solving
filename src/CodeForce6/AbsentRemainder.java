package CodeForce6;

import java.util.*;

public class AbsentRemainder {

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
		    Long x = a[0];
		    for(int i=1;i<=n/2;i++) {
		    	System.out.println(a[i]+" "+x);
		    }
			t--;
		}

	}

}
