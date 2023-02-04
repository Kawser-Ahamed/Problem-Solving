package CodeForce5;

import java.util.Scanner;

public class NearlyGoodNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long t = sc.nextLong();
		
		while(t>0) {
			
			Long a = sc.nextLong();
			Long b = sc.nextLong();
			Long c = (a*b)*b;
			
			if(b==1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
				System.out.println(a+" "+(c-a)+" "+c);
			}
			
			t--;
		}

	}

}
