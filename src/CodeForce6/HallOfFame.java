package CodeForce6;

import java.util.*;

public class HallOfFame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			int ans = -1;
			
			
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i)=='R' && str.charAt(i+1)=='L') {
					ans = 0;
					break;
				}
				else if(str.charAt(i)=='L' && str.charAt(i+1)=='R') {
					ans = i+1;
				}
			}
			System.out.println(ans); 
			
			t--;
		}

	}

}
