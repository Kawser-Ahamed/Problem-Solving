package CodeForce4;

import java.util.*;

public class Sale {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []a = new int[n];
		int sum =0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<m;i++) {
			if(a[i]<=0) {
				sum+=Math.abs(a[i]);
			}
		}
		
		System.out.println(sum);

	}

}
