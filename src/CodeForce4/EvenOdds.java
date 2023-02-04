package CodeForce4;

import java.util.*;

public class EvenOdds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long div = n/2;
		long p = div+(n%2);
		
		if(k<=p) {
			System.out.println((k*2)-1);
		}
		else {
			long sum = k-p;
			System.out.println(sum*2);
		}
		
		
	}

}
