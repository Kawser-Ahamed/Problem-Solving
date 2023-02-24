package Codeforce7;

import java.util.*;

public class GoingToTheCinema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int c=1;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			
			if(a[0]!=0) {
				c++;
			}
			for(int i=0;i<n-1;i++) {
				if(a[i]<=i && i+1<a[i+1]) {
					c++;
				}
			}
			
			System.out.println(c);
			t--;
		}
		sc.close();

	}

}
