package Codeforce7;

import java.util.*;

public class A_858 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int m = 0;
			
			if(d<b) {
				System.out.println(-1);
			}
			else {
				m+=(d-b);
				a+=m;
				if(a<c) {
					System.out.println(-1);
				}
				else {
					m+=(a-(c));
					System.out.println(m);
				}
			}
			t--;
		}
		sc.close();
	}

}
