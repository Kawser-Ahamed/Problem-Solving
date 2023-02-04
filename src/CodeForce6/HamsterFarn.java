package CodeForce6;

import java.util.*;

public class HamsterFarn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long k= sc.nextLong();
		long min=1000000000000000000L;
		Long a=0L;
		Long index=0L;
		Long v=0L;
		
		for(Long i=0L;i<k;i++) {
			a=sc.nextLong();
			Long d = n%a;
			if(d<=min) {
				min = n%a;
				index=i+1;
				v = a;
			}
		}
		
		System.out.println(index+" "+n/v);
	}

}
