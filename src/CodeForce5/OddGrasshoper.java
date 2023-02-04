package CodeForce5;

import java.util.Scanner;

public class OddGrasshoper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
		
		while(t>0) {
			
			long x = sc.nextLong();
			long n = sc.nextLong();
			
			long tw = 0;
			
			if(x%2==0) {
				tw=x+1;
			}
			else {
				tw=x-1;
			}
			
			if(n%4==0) {
				System.out.println(x);
			}
			else if(n%2==0) {
				System.out.println(tw);
			}
			else {
				long b=n-1;
				if(b%4==0) {
					if(x%2==0) {
						System.out.println(x-n);
					}
					else {
						System.out.println(x+n);
					}
				}
				else if(b%2==0) {
					if(x%2==0) {
						System.out.println(tw+n);
					}
					else {
						System.out.println(tw-n);
					}
				}
			}
			
			t--;
		}

	}

}
