package Contest_3;

import java.util.*;

public class A_862 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int a[] = new int[n];
			int x = 0,ans=-1;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(i>0) {
					x = x^a[i];
				}
				else {
					x = a[i];
				}
			}
			
			int prev = x^a[0];
		    for(int i=1;i<n;i++) {
		    	
		    	
		    	ans = x^a[i];
		    	prev^=ans;
		    }
		   
		    if(prev==0) {
		    	System.out.println(x);
		    }
		    else {
		    	System.out.println(-1);
		    }
			t--;
		}
		
		sc.close();

	}

}
