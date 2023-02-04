package CodeForce6;

import java.util.*;

public class AssigningToClasses {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			n+=n;
			int []a = new int [n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			
			Arrays.sort(a);
			System.out.println(Math.abs(a[(n/2)-1]-a[(n/2)]));
			
			t--;
		}

	}

}
