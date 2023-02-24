package Codeforce7;

import java.util.*;

public class EhabAndSubtraction {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int []a = new int [n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		int sum=a[0];
		int c=1;
		
		for(int i=1;i<n;i++) {
			if(a[i]!=a[i-1]) {
				if(c==k) {
					break;
				}
				int x = a[i]-sum;
				sum+=x;
				c++;
				System.out.println(x);
			}
		}
		
		if(c<k) {
			for(int i=1;i<=k-c;i++) {
				System.out.println(0);
			}
		}
		
		sc.close();
		
	}

}
