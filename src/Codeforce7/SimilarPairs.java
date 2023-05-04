package Codeforce7;

import java.util.*;

public class SimilarPairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int e=0,o=0,c=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(a[i]%2==0) {
					e++;
				}
				else {
					o++;
				}
			}
			e = (e/2)*2;
			o = (o/2)*2;
			
			if((e+o)>=n) {
				System.out.println("YES");
			}
			else {
				Arrays.sort(a);
				for(int i=1;i<n;) {
					if(a[i]-a[i-1]==1) {
						c+=2;
						i+=2;
						continue;
					}
					i++;
				}
				if((e+o+c)>=n) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
		}
		
		sc.close();

	}

}
