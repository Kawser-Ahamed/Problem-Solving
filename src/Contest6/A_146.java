package Contest6;

import java.util.*;

public class A_146 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			Long n = sc.nextLong();
			Long k = sc.nextLong();
			
			if(n%2==1 && (k%2)==0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
		}
		sc.close();

	}

}
