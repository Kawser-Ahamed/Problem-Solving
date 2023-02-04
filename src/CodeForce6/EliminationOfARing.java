package CodeForce6;

import java.util.*;

public class EliminationOfARing {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for (int ii = 0; ii < t; ii++) {
	            int n = in.nextInt();
	            Set<Integer> set = new HashSet<>();
	            for(int i = 0; i < n; i++) {
	                set.add(in.nextInt());
	            }
	            System.out.println(set);
	        }

	}

}
