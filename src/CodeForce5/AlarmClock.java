package CodeForce5;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long t = sc.nextLong();
		
		while(t>0) {
			
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			Long c = sc.nextLong();
			Long d = sc.nextLong();
			
			if(b>=a) {
				System.out.println(b);
			}
			else if(d>=c) {
				System.out.println(-1);
			}
			else {
				Long x = c-d;
				Long e = a-b;
				Long f = e/x;
				if(e%x>0) {
					f++;
				}
				b+=f*c;
				System.out.println(b);
			}
			t--;
		}

	}

}
