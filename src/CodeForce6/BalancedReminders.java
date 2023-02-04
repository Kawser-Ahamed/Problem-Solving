package CodeForce6;

import java.util.Scanner;

public class BalancedReminders {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int c0 =0;
			int c1 = 0;
			int c2 = 0;
			int m = 0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
				if(a[i]%3==0) {
					c0++;
				}
				else if(a[i]%3==1) {
					c1++;
				}
				else {
					c2++;
				}
			}
			
			int x = n/3;
			
			if(c0<x) {
				int p =0;
				int d = x-c0;
				if(c2>x) {
					p = c2-x;
				}
				c0+=p;
				if(c0>=x) {
					c2-=d;
					m+=d;
				}
				else {
					m+=p;
					c2-=p;
					d = x-c0;
					m+=d*2;
					c1-=d;
				}
				c0=x;
				
			}
		    if(c1<x) {
		    	int p =0;
				int d = x-c1;
				if(c0>x) {
					p = c0-x;
				}
				c1+=p;
				if(c1>=x) {
					c0-=d;
					m+=d;
				}
				else {
					m+=p;
					c0-=p;
					d = x-c1;
					m+=d*2;
					c2-=d;
				}
				c1=x;
				
			}
		    
		    if(c2<x) {
		    	int p =0;
				int d = x-c2;
				if(c1>x) {
					p = c1-x;
				}
				c2+=p;
				if(c2>=x) {
					c1-=d;
					m+=d;
				}
				else {
					m+=p;
					c1-=p;
					d = x-c2;
					m+=d*2;
					c0-=d;
				}
				c2=x;
		    }
			System.out.println(m);
			t--;
		}

	}

}
