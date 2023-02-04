package CodeForce6;

import java.util.*;

public class NastyaIsPlayingComputeGames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int t = 0;
		
		int a = n-k;
		int b = k-1;
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		t += (min*2)+max+((2*(n-1))+3);
		
		System.out.println(t);
		
		sc.close();
	}

}
