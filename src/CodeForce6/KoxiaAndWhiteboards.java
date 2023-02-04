package CodeForce6;

import java.util.*;

public class KoxiaAndWhiteboards {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			Long sum = 0L;
			PriorityQueue<Long> pr = new PriorityQueue<Long>();
			
			for(int i=0;i<n;i++) {
				pr.add(sc.nextLong());
			}
			for(int i=0;i<m;i++) {
				pr.poll();
				pr.add(sc.nextLong());
			}
			
			while(!pr.isEmpty()) {
				sum+=pr.poll();
			}
			
			System.out.println(sum);
			
			t--;
		}

	}

}
