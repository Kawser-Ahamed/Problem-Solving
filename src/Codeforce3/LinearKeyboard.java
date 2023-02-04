package Codeforce3;

import java.util.*;

public class LinearKeyboard {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			String x = sc.next();
			String str = sc.next();
			char c;
			char d;
			int pos=0;
			int pos2=0;
			int total = 0;
			
			for(int i=0;i<str.length()-1;i++) {
				c = str.charAt(i);
				d = str.charAt(i+1);
				for(int j=0;j<x.length();j++) {
					if(c==x.charAt(j)) {
						pos = j+1;
					}
					if(d==x.charAt(j)) {
						pos2 = j+1;
					}
				}
				total += Math.abs(pos-pos2);
			}
			System.out.println(total);
			t--;
		}

	}

}
