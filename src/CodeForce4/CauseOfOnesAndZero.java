package CodeForce4;

import java.util.Scanner;

public class CauseOfOnesAndZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int a=0;
		int b=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0') {
				a++;
			}
			else {
				b++;
			}
		}
		
		int m = Math.min(a, b);
		m*=2;
		
		System.out.println(n-m);

	}

}
