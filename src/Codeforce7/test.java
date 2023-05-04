package Codeforce7;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			String str = sc.next();
			int c = 0;
			String s = "1";
			
			if(str.charAt(0)=='0') {
				System.out.println(0);
			}
			else {
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='?') {
						c++;
					}
				}
				for(int i=1;i<=c;i++) {
					s = s.concat("0");
				}
				int n = Integer.parseInt(s);
				if(str.charAt(0)=='?' && c>1) {
					System.out.println(n-10);
				}
				else if(str.charAt(0)!='?' && c>1) {
					System.out.println(n);
				}
				else if(c==0 && str.charAt(0)!='0') {
					System.out.println(1);
				}
				else {
					System.out.println(n-1);
				}	
			}
		}
		sc.close();

	}

}
