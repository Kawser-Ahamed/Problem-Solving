package CodeForce4;

import java.util.*;

public class Triple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int c = -1;
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			
			for(int i=0;i<n-2;i++) {
				if(a[i]==a[i+1] && a[i]==a[i+2]) {
					c=a[i];
					break;
				}
			}
			System.out.println(c);
			t--;
		}

	}

}
