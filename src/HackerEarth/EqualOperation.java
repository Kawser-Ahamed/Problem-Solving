package HackerEarth;

import java.util.*;

public class EqualOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int []a = new int[n];
			int c=0;
			int sum=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			int x = a[0];
			
			while(x>0) {
				for(int i=0;i<n;i++) {
					if(a[i]%x==0) {
						c++;
						int d = a[i]/x;
						sum+=d-1;
					}
				}
				if(c==n) {
					System.out.println(sum);
					break;
				}
				sum=0;
				c=0;
				x--;
			}
			
			t--;
		}
		
		sc.close();

	}

}
