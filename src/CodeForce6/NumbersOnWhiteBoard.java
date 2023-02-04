package CodeForce6;

import java.util.*;

public class NumbersOnWhiteBoard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int r = 0;
			
			System.out.println(2);
			System.out.println(n-1+" "+n);
			r = ((n+(n-1))/2)+(((n+(n-1))%2));
			for(int i=n-2;i>=1;i--) {
				System.out.println(i+" "+r);
				r = ((i+r)/2)+((i+r)%2);
			}
			t--;
		}
		

	}

}
