package Contest_8;

import java.util.*;

public class B_868 {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int []a = new int[n];
			int c = 0;
			
			for(int i=0;i<n;i++) {		
				a[i]=sc.nextInt();
				if(Math.abs(a[i]-(i+1))%k!=0) {
					c++;
				}
			}
			
			if(c==0) {
				System.out.println(0);
			}
			else if(c==2) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
		}
		
		sc.close();

	}

}
