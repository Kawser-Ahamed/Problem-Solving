package Contest6;

import java.util.*;

public class D {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		Long t = sc.nextLong();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Long q = sc.nextLong();
			int a[] = new int[n+5];
			int b[] = new int[n+5];
			b[0]=0;
			
			for(int i=1;i<=n;i++) {
				a[i]=sc.nextInt();
				b[i]=a[i]+b[i-1];
			}
			
			while(q-->0) {
				Long l = sc.nextLong();
				Long r = sc.nextLong();
				Long k = sc.nextLong();
				
				Long c = (long) (b[(int) (r-0)]-b[(int) (l-1)]);
				Long d = b[n]-c+((r-l+1)*k);
				
				if(d%2==1) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
			t--;
		}
		
		sc.close();

	}

}
