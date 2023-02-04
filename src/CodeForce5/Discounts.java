package CodeForce5;

import java.util.*;

public class Discounts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Long []a = new Long [n];
		Long sum =0L;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			sum+=a[i];
		}
		
		Arrays.sort(a);
		
		int m = sc.nextInt();
		Long b[] = new Long [m];
		
		for(int i=0;i<m;i++) {
			b[i]=sc.nextLong();
			System.out.println(sum-(a[(int) (n-b[i])]));
		}

	}

}
