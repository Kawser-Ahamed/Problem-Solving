package CodeForce4;

import java.util.Scanner;

public class Keyboard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		String str = sc.next();
		char []s = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l',';','z','x','c','v','b','n','m',',','.','/'};
		String m="";
		
		if(x.equals("R")) {
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<s.length;j++) {
					if(str.charAt(i)==s[j]) {
						m = m.concat(String.valueOf(s[j-1]));
					}
				}
			}
		}
		
		if(x.equals("L")) {
			for(int i=0;i<str.length();i++) {
				for(int j=0;j<s.length;j++) {
					if(str.charAt(i)==s[j]) {
						m = m.concat(String.valueOf(s[j+1]));
					}
				}
			}
		}
		
		System.out.println(m);

	}

}
