package CodeForce4;

import java.util.Scanner;

public class ShiftingStacks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			long []a = new long[n];
			long flag=1;
			long j = 1;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			for(int i=0;i<n-1;i++) {
					long s = a[i]-i;
					if(s<0) {
						break;
					}
					a[i] = a[i]-s;
					a[i+1]+=s;	
			}
			
			for(int i=0;i<n-1;i++) {
				if(a[i]<a[i+1]) {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
				
			t--;
		}
	}

}
