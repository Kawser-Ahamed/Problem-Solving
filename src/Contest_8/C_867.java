package Contest_8;

import java.util.*;

public class C_867 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			Long n = sc.nextLong();
			Long p = (long) Math.pow(n, 2);
			long ans = (long) (((n+1)*2)+p);
			System.out.println(ans);
		}
		
		sc.close();

	}

}
