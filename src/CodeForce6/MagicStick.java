package CodeForce6;

import java.util.*;

public class MagicStick {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			Long x = sc.nextLong();
			Long y = sc.nextLong();
			
			if((x==1 && y>x) || (x==2 && y>3) || (x==3 && y>x)) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			
			t--;
		}

	}

}
