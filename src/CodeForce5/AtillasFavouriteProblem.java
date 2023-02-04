package CodeForce5;

import java.util.*;

public class AtillasFavouriteProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			Vector<Integer> vec = new Vector<Integer>();
			
			for(int i=0;i<str.length();i++) {
				vec.add((int) str.charAt(i));
				
			}
			int max = Collections.max(vec);
			int x = max-96;
			System.out.println(x);
			t--;
		}

	}

}
