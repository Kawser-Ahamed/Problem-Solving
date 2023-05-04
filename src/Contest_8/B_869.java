package Contest_8;

import java.util.*;

public class B_869 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            if(n==1) {
            	System.out.println(1);
            }
            else if(n%4!=2) {
            	System.out.println(-1);
            }
            else {
            	for(int i=1;i<=n;i++) {
            		System.out.print(i+" ");
            	}
            	System.out.println();
            }
        }
        sc.close();
    }
}