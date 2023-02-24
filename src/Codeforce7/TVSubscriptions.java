package Codeforce7;

import java.util.*;

public class TVSubscriptions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			@SuppressWarnings("unused")
			int k = sc.nextInt();
			int d = sc.nextInt();
			int []a = new int[n];
			HashSet<Integer> hash = new HashSet<>();
			Vector<Integer> vec = new Vector<>();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<=n-d;i++) {
				for(int j=i;j<i+d;j++) {
					hash.add(a[j]);
				}
				vec.add(hash.size());
				hash.removeAll(hash);
			}
			System.out.println(Collections.min(vec));
			t--;
		}
		
		sc.close();

	}

}
