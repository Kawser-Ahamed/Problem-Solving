package CodeForce5;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int t=0;
		int th = 0;
		int tw =0;
		int o =0;
		int thh=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
			
			if(a[i]==4) {
				t++;
			}
			if(a[i]==3) {
				t++;
				th+=3;
				thh++;
			}
			if(a[i]==2) {
				tw+=2;
			}
			if(a[i]==1) {
				o++;
			}
		}
		
		int s = thh*4-th;
		o-=s;
		if(o<0) {
			o=0;
		}

		tw+=o;
		t+=tw/4;
		o=tw%4;
		
		if(o>0) {
			t++;
		}

		System.out.println(t);


	}

}
