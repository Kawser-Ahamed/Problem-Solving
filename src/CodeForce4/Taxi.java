package CodeForce4;

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
		int sum=0;
		int sumOfThree=0;
		int sumOfTwo=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
			
			if(a[i]==4) {
				t++;
			}
			if(a[i]==3) {
				t++;
				th++;
				sumOfThree+=a[i];
			}
			if(a[i]==2) {
				sumOfTwo+=a[i];
			}
			if(a[i]==1) {
				o++;
			}
		}
		if(th == o) {
			o=0;
		}
		else if(sumOfThree%4!=0) {
			for(int i=1;i<=4;i++) {
				if(o==0 || sumOfThree%4==0) {
					break;
				}
				else {
					sumOfThree++;
					o--;
				}
			}
		}
		t+=sumOfTwo/4;
		o+=sumOfTwo%4;
		t+=o/4;
		if(o%4>=1) {
			t++;
		}
		System.out.println(t);
	}

}
