package Contest_4;

import java.util.*;

public class A_861 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int max = 0;
			int ans = l;
			
			while(l<=r) {
				String str = String.valueOf(l);
				char []c = str.toCharArray();
				Arrays.sort(c);
				String lo = String.valueOf(c[0]);
				String hi = String.valueOf(c[c.length-1]);
				int low = Integer.parseInt(lo);
				int high = Integer.parseInt(hi);
				int d = high-low;
				
				if(d==9) {
					ans = l;
					break;
				}
				
				if(d>max) {
					max = d;
					ans = l;
				}
				
				l++;
			}
			
			System.out.println(ans);
		}	
		sc.close();

	}

}
