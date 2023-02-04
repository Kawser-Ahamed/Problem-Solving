package CodeForce2;

import java.util.Scanner;

public class CPlusEqual {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum=0;
			int count =0;
			
			while(a<=n && b<=n) {
				
				if(a<b) {
					a+=b;
					count++;
				}
				else {
					b+=a;
					count++;
				}
			}

			System.out.println(count);
			t--;
		}

	}

}
