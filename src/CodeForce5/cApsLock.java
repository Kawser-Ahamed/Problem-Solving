package CodeForce5;

import java.util.*;

public class cApsLock {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int u =0;
		String s = String.valueOf(str.charAt(0));
		s = s.toUpperCase();
		String x = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)<=90) {
				u++;
			}
			if(i>=1) {
				x = x.concat(String.valueOf(str.charAt(i)));
			}
		}
		
		x = x.toLowerCase();
		s = s.concat(x);
		
		if(str.length()==1 && str.charAt(0)>=97) {
			System.out.println(str.toUpperCase());
		}
		else if(u==str.length()-1 && str.charAt(0)>=97) {
			System.out.println(s);
		}
		else if(u==str.length()) {
			System.out.println(str.toLowerCase());
		}
		else {
			System.out.println(str);
		}
		
		
 
	}
 
}