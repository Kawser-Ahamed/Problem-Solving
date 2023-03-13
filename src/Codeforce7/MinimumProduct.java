package Codeforce7;

import java.util.*;

public class MinimumProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			Long x = sc.nextLong();
			Long y = sc.nextLong();
			Long n = sc.nextLong();
			Long m1=0L,m2=0L,temp=0L;
			
			m1 = a-n;
			m2 = b-n;
			
			if(m1<x) {
				m1=x;
			}
			if(m2<y) {
				m2=y;
			}
			
			if(m1<=m2) {
				temp = a-m1;
				n-=temp;
				if(n>m2) {
					b=m2;
				}
				else {
					b-=n;
				}
				System.out.println(m1*b);
			}
			else {
				temp = b-m2;
				n-=temp;
				if(n>m1) {
					a=m1;
				}
				else {
					a-=n;
				}
				System.out.println(a*m2);
			}	
			t--;
		}
		sc.close();

	}

}
