package CodeForce5;

import java.util.*;

public class MahmoudAndTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int flag=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<n-2;i++) {
			if(a[i]+a[i+1]>a[i+2]) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
