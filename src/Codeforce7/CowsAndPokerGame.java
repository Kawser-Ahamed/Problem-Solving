package Codeforce7;

import java.util.*;
public class CowsAndPokerGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int c = 0;
		for(int i=0;i<n;i++) {
			String str2="";
			str2 = str.substring(i+1, n);
			str2 = str2.concat(str.substring(0,i));
			if(str2.contains("I") || str.charAt(i)=='F') {
				c+=0;
			}
			else {
				c++;
			}
		}
		System.out.println(c);
		sc.close();
	}
}
