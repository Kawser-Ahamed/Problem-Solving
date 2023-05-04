package Contest6;

import java.util.*;

public class CC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			Vector<Long> vec = new Vector<>();
			Vector<Long> vec2 = new Vector<>();
			Long cost = 0L;
			
			for(int i=0;i<n;i++) {
				vec.add(sc.nextLong());
			}
			
			Collections.sort(vec);
			
			for(int i=0;i<n;i++) {
				if(vec.elementAt(i)!=(i+1)) {
					int m1 = (vec.size()-i+1);
				}
			}
			
			
			sc.close();
			
		}

	}

}
