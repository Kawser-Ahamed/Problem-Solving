package Contest_5;

import java.util.*;

public class A_853 {

public static Long gcd(Long a,Long b) {
	if(a==0) {
		return b;
	}
	return gcd(b%a,a);
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int t = sc.nextInt();
	
	while(t>0) {
		
		int n = sc.nextInt();
		Long []a = new Long[n];
		Long k =0L,x=0L,y=0L;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			k = gcd(k,a[i]);
		}
		Arrays.sort(a);
		
		for(int i=1;i<n;i++) {
			Long z = gcd(a[i],a[0]);
			if(z<3) {
				y=1L;
			}
		}
		
		if(y==0 || k>n) {
			System.out.println("NO");
		}
		else {
			System.out.println("Y");
		}
		
		t--;
	}
	sc.close();
	
  }

}
