package Codeforce7;

import java.util.*;

public class YetAnotherPalindromeProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			boolean flag=false;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			for(int i=0;i<n-2;i++) {
				for(int j=i+2;j<n;j++) {
					if(a[i]==a[j]) {
						flag=true;
					}
				}
			}
			
			if(flag) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}
		
		sc.close();

	}

}
