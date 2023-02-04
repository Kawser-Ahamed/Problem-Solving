package Contest6;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = String.valueOf(n);
		String s = "";
		int f = 0;
		int f2 = 0;
		
		String x = String.valueOf(str.charAt(0));
		int p = Integer.parseInt(x);
		if(p<=4) {
			s = s.concat("4");
			f++;
		}
		else {
			s = s.concat("7");
			f2++;
		}
		x = String.valueOf(str.charAt(1));
		p = Integer.parseInt(x);
		if(p<=4) {
			s = s.concat("4");
			f++;
		}
		else {
			s = s.concat("7");
			f2++;
		}
		
		int l = str.length();
		l = l/2;
		
		for(int i=2;i<str.length();i++) {
			
		}
		

	}

}
