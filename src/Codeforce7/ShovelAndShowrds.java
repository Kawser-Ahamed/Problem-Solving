package Codeforce7;

import java.util.*;

public class ShovelAndShowrds {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			Long c = (a+b)/3;
			if(Math.min(a, b)>=c) {
				System.out.println(c);
			}
			else {
				System.out.println(Math.min(a, b));
			}
		}
		sc.close();
	}

}
