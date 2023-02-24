package Codeforce7;

import java.util.*;

public class TurnTheRectangles {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		int max = Integer.MAX_VALUE;
		int flag=1;
		
		for(Long i=1L;i<=n;i++) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(Math.max(w, h)<=max) {
				max = Math.max(w, h);
			}
			else if(Math.min(w, h)<=max) {
				max = Math.min(w,h);
			}
			else {
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
		sc.close();

	}

}
