package CodeForce6;

import java.util.*;

public class BuggyRobot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int u =0,l=0,d=0,r=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='U') {
				u++;
			}
			else if(str.charAt(i)=='D') {
				d++;
			}
			else if(str.charAt(i)=='R') {
				r++;
			}
			else if(str.charAt(i)=='L') {
				l++;
			}
		}
		
		int x = Math.abs(r-l);
		int y = Math.abs(u-d);
		x+=y;
		System.out.println(n-x);

	}

}
