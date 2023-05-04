package Codeforce7;

import java.util.*;

public class MiddleClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long t = sc.nextLong();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			Long m = sc.nextLong();
			Long sum=0L,c=0L;
			Long []a = new Long[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
				if(a[i]>=m) {
					sum+=a[i]-m;
					c++;
					continue;
				}
			}
			
			Arrays.sort(a);
			
			for(int i=a.length-1;i>=0;i--) {
				if(a[i]<m) {	
					Long d = m-a[i];
					if(sum>=d) {
						sum-=d;
						c++;
					}
					else {
						break;
					}	
				}
			}
			
			System.out.println(c);
		}
		sc.close();

	}

}
