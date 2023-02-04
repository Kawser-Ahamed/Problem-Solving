package CodeForce4;

import java.util.Scanner;

public class ExcitingBets {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();	
		
		while(t>0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			
			if(a==b) {
				System.out.println(0+" "+0);
			}
			else {
				long g = Math.abs(a-b);
				long s = (g-(a%g));
				System.out.println(g+" "+Math.min(s, a%g));
			}
			t--;
		}

	}

}
