package CodeForce6;

import java.util.*;

public class MakeItBeautifull {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Vector<Integer> vec = new Vector<>();
			int c = 0;
			
			for(int i=0;i<n;i++) {
				vec.add(sc.nextInt());
			}
			Collections.sort(vec);
			
			for(int i=0;i<n-1;i++) {
				if(vec.elementAt(i)==vec.elementAt(i+1)) {
					c++;
				}
			}
			
			if(c==n-1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				System.out.print(Collections.max(vec)+" ");
				for(int i=0;i<n-1;i++) {
					System.out.print(vec.elementAt(i)+" ");
				}
			}
			
			
			t--;
		}

	}

}
