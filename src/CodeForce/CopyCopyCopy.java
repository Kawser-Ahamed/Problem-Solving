package CodeForce;

import java.util.*;

public class CopyCopyCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			HashSet<Integer> hash = new LinkedHashSet<Integer>();
			for(int i=0;i<n;i++) {
				hash.add(sc.nextInt());
			}
			System.out.println(hash.size());
			t--;
		}

	}

}
