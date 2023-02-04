package CodeForce5;

import java.util.*;

public class Advantage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			long []a = new long[n];
			Vector<Long> vec = new Vector();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				vec.add(a[i]);
			}
			
			Collections.sort(vec);
			
			for(int i=0;i<n;i++) {
				if(a[i]==vec.elementAt(n-1)) {
					System.out.print(vec.elementAt(n-1)-vec.elementAt(n-2)+" ");
				}
				else {
					System.out.print(a[i]-vec.elementAt(n-1)+" ");
				}
			}
			t--;
		}

	}

}
