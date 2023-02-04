package CodeForce6;

import java.util.*;

public class PolycrapTraining {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int  n = sc.nextInt();
		Vector<Integer> vec = new Vector<Integer>();
		
		for(int i=0;i<n;i++) {
			vec.add(sc.nextInt());
		}
		
		Collections.sort(vec);
		int k = 1;
		
		for(int i=0;i<n;i++) {
			if(vec.elementAt(i)<k ) {
				continue;
			}
			k++;	
		}
		
		System.out.println(k-1);
		
	}

}
