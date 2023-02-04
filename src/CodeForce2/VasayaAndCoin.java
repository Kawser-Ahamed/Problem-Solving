package CodeForce2;

import java.util.Scanner;

public class VasayaAndCoin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			b*=2;
			
			if(a==0) {
				System.out.println(1);
			}
			else {
				int c = (b+a)+1;
				System.out.println(c);
			}
			t--;
		}

	}

}
