package Daffodil;

import java.util.*;

public class D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			if(n==0 || m==0) {
				System.out.println(-1);
			}
			else if(m>n) {
				n*=2;
				System.out.println((1000/n)+(1000%n));
			}
			else {
				System.out.println((1000/m)+(1000%m));
			}
			t--;
		}

	}

}
