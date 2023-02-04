package CodeForce5;

import java.util.*;

public class TheNumberOfPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int t = (b+1);
		int c = t+a;
		int total = c-n;
		
		if(total>0) {
			System.out.println(t-total);
		}
		else {
			System.out.println(t);
		}
		

	}

}
