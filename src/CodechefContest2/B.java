package CodechefContest2;

import java.util.*;

public class B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int sum = x+y+z;
			sum-=3;
			
			if(sum>2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}

	}

}
