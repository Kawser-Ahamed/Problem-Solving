package CodeForce6;

import java.util.*;

public class GamingForces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Vector<Integer> vec = new Vector<Integer>();
			int total=0;
			
			for(int i=0;i<n;i++) {
				vec.add(sc.nextInt());
				
				if(vec.elementAt(i)==1) {
					total++;
				}
				
			}
			
			System.out.println(n-(total/2));
			
			
			
			t--;
		}

	}

}
