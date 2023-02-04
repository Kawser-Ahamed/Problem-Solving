package CodeForce6;

import java.util.*;

public class PheonixAndPuzzle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			double n = sc.nextDouble();
			
			if(Math.sqrt(n/2)==(int)Math.sqrt(n/2) || Math.sqrt(n/4)==(int)Math.sqrt(n/4))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			t--;
		}

	}

}
