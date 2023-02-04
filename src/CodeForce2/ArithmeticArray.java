package CodeForce2;

import java.util.Scanner;

public class ArithmeticArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int[]a = new int[n];
			int sum=0;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				sum+=a[i];
			
			}
			if(sum/n==1 && sum%n==0) {
				System.out.println(0);
			}
			else if(sum<=1 || sum<n) {
				System.out.println(1);
			}
			else {
				System.out.println(Math.abs(sum-n));
			}
			
			t--;
		}
		
		

	}

}
