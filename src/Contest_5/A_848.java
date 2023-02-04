package Contest_5;

import java.util.*;

public class A_848 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int t  = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int p = 0;
			int m = 0;
			int flag=0;
			int prev = 0;
			int c = 0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				if(i>=1) {
					prev = a[i-1];
					
				}
				if(a[i]>0) {
					p++;
				}
				else {
					m++;
					c++;
					if(flag==0) {
						if(prev == a[i]) {
							m-=2;
							p+=2;
							flag=1;
						}
					}
				}
			}
			if(c==0) {
				System.out.println(p-4);
			}
			else {
				System.out.println(p-m);
			}
			t--;
		}

	}

}
