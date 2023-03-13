package Contest5;

import java.util.*;

public class C_855 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long []a = new Long[n];
			Long sum=0L;
			Long max = 0L;
			int index =0;
			int start =0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextLong();
			}
			
			for(int i=1;i<n;i++) {
				if(a[i]==0L) {
					for(int j=start;j<i;j++) {
						if(a[j]>max) {
							max=a[j];
							index=j;
							
						}
					}
					sum+=max;
					max=0L;
					start = index+1;
				}
			}
			System.out.println(sum);
			t--;
		}
		
		sc.close();

	}

}
