package CodeForce4;

import java.util.*;

public class KefaAndFirstSteps {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []a = new int[n];
		int count =1;
		Vector<Integer> vec = new Vector<Integer>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			if(a[i]<=a[i+1]) {
				count++;
			}
			else {
				vec.add(count);
				count=1;
			}
		}
		vec.add(count);
		System.out.println(Collections.max(vec));

	}

}
