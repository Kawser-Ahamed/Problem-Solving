package Contest_8;

import java.util.*;

public class D_867 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			
			int end = n;
			int start = 1;
			int c =0;
			
			if(n%2==1 && n!=1) {
				System.out.print(-1);
			}
			else if(n==1) {
				System.out.print(1);
			}
			else {
				while(c!=n) {
					System.out.print(end+" ");
					System.out.print(start+" ");
					c+=2;
					end-=2;
					start+=2;
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
