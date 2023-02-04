package CodeForce5;

import java.util.*;

public class PermutationSort {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n+1];
			int c=0;
			
			for(int i=1;i<=n;i++) {
				a[i]=sc.nextInt();
				if(a[i]!=i) {
					c++;
				}
			}
			
			if(c==0) {
				System.out.println(c);
			}
			else if(a[1]==1 || a[n]==n){
				System.out.println(1);
			}
			else if(a[1]==n && a[n]==1) {
				System.out.println(3);
			}
			else if(a[1]!=1 && a[n]!=n) {
				System.out.println(2);
			}
			
			t--;
		}

	}

}
