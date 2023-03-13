package Contest_3;

import java.util.*;

public class A854 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			Long n = sc.nextLong();
			Long m = sc.nextLong();
			Vector<Long> vec = new Vector<>();
			HashMap<Long,Integer> map = new HashMap<>();
			Long c = 0L,k=0L;
			Long a;
			
			for(int i=1;i<=m;i++) {
				a = sc.nextLong();
				if(map.containsKey(a)) {
					c++;
				}
				else {
					c++;
					k++;
					if(k<=n) {
						vec.add(c);
					}
				}
				map.put(a, 1);
			}
			
			Collections.reverse(vec);
			
			for(int i=vec.size();i<n;i++) {
				System.out.print(-1+" ");
			}
			for(int i=0;i<vec.size();i++) {
				System.out.print(vec.elementAt(i)+" ");
			}
			System.out.println();
			t--;
		}
		
		sc.close();

	}

}
