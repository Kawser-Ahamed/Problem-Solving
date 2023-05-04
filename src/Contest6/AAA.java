package Contest6;

import java.util.*;

public class AAA {
	
	public static int findGcd(int x,int y) {
		
		if(x==0) {
			return y;
		}
		return findGcd(y % x, x);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int g = findGcd(x,y);
			
			if(g==1) {
				System.out.println(1);
				System.out.println(x+" "+y);
			}
			else {
				System.out.println(2);
				System.out.println((x-1)+" "+1);
				System.out.println(x+" "+y);
			}
			
			
			t--;
		}

	}

}
