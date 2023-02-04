package CodeForce5;

import java.util.*;

public class TheatreSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long m = sc.nextLong();
		Long a = sc.nextLong();
		
		Long x = n%a;
		Long y = m%a;
		if(x>=1) {
			x=1L;
		}
		else {
			x=0L;
		}
		if(y>=1) {
			y=1L;
		}
		else {
			y=0L;
		}
		System.out.println(((n/a)+x)*((m/a)+y));

	}

}
