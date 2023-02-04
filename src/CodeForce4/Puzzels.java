package CodeForce4;

import java.util.*;

public class Puzzels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int []a = new int[m];
		Vector vec = new Vector();
		
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		for(int i=0;i<=m-n;i++) {
			int s = a[i+(n-1)]-a[i];
			vec.add(s);
		}
		System.out.println(Collections.min(vec));

	}

}
