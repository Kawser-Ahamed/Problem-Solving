package Contest_1;

import java.util.*;

public class SelectThreeSticks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int []b = new int[n-1];
			Vector vec = new Vector();
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<n-1;i++) {
				int m = a[i+1]-a[i];
				b[i]=m;
			}
			for(int i=0;i<n-2;i++) {
				int sum = b[i]+b[i+1];
				vec.add(sum);
			}
			
			System.out.println(Collections.min(vec));
			
			t--;
		}

	}

}
