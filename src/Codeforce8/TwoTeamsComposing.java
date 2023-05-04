package Codeforce8;

import java.util.*;

public class TwoTeamsComposing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			HashSet<Integer> hash = new HashSet<>();
			int max = Integer.MIN_VALUE,c=1;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				hash.add(a[i]);
			}
			Arrays.sort(a);
			for(int i=0;i<n-1;i++) {
				if(a[i]==a[i+1]) {
					c++;
				}
				else {
					if(c>max) {
						max = c;
					}
					c=1;
				}
			}
			if(c>max) {
				max = c;
			}
			
			int min = Math.min(max, hash.size());
			
			if((min*2)>n) {
				System.out.println(n/2);
			}
			else if(max == hash.size()) {
				System.out.println(max-1);
			}
			else {
				System.out.println(min);
			}
		}
		
		sc.close();

	}

}
