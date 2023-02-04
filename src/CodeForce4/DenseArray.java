package CodeForce4;

import java.util.*;

public class DenseArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int []a = new int[n];
			int count=0;
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			//Arrays.sort(a);
			
			for(int i=0;i<n-1;i++) {
				int max = Math.max(a[i], a[i+1]);
				int min = Math.min(a[i], a[i+1]);
				if(max>min*2) {
					while(min*2<max) {
						min=min*2;
						count++;
					}
				}
			}
			System.out.println(count);
			t--;
		}

	}

}
