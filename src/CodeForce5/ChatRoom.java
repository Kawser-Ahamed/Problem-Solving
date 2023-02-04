package CodeForce5;

import java.util.*;

public class ChatRoom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String s = "hello";
		int sum=0;
		int j=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==s.charAt(j)) {
				sum++;
				j++;
				if(j>=4) {
					j=4;
				}
			}
		}
		
		if(sum>=5) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
