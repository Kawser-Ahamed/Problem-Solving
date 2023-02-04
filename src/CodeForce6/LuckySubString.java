package CodeForce6;

import java.util.*;

public class LuckySubString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int f = 0;
		int s = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='4') {
				f++;
			}
			else if(str.charAt(i)=='7') {
				s++;
			}
		}
		
		if(f==0 && s==0) {
			System.out.println(-1);
		}
		else if(f>=s) {
			System.out.println(4);
		}
		else {
			System.out.println(7);
		}
		
		sc.close();

	}

}
