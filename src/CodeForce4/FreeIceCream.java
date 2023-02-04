package CodeForce4;

import java.util.Scanner;

public class FreeIceCream {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long n = sc.nextInt();
		long d = 0;
		
		while(t>0) {
			String x = sc.next();
			String y = sc.next();
			
			if(x.charAt(0)=='+') {
				n+=Long.parseLong(y);
			}
			else {
				n-=Long.parseLong(y);
				if(n<0) {
					d++;
					n+=Long.parseLong(y);
				}
			}
			t--;
		}
		
		System.out.println(n+" "+d);
		
	}

}
