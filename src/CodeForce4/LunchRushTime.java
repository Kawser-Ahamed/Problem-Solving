package CodeForce4;

import java.util.*;

public class LunchRushTime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		Vector<Long> vec = new Vector<Long>();
		
		for(long i=1;i<=n;i++) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			
			if(b<=k) {
				vec.add(a);
			}
			else {
				vec.add((a-(b-k)));
			}
		}
		
		System.out.println(Collections.max(vec));

	}

}
