package CodeForce5;

import java.util.*;

public class BestPresent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			int x =0;
			
			if(l==r) {
				x=r;
			}
			else if((r-l)%2==1) {
				x = ((r-l)/2)+1;
			}
			else {
				x = (((r-1)-l)/2)+1;
				x=r-x;
			}
			
			if(r%2==0) 
				System.out.println(x);
			else
				System.out.println(-x);
			
			t--;
		}

	}

}
