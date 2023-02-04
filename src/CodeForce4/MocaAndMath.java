package CodeForce4;

import java.util.Scanner;

public class MocaAndMath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			long a[] = new long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			long k= a[0];
			for(int i=1;i<n;i++) {
				k = k&a[i];
			}
			System.out.println(k);
			t--;
		}

	}

}
