package Contest_3;

import java.util.*;

public class test {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			Vector<Integer> vec = new Vector<>();
			int sum=0,ans=-1,c=0;
			
			for(int i=0;i<n;i++) {
				vec.add(sc.nextInt());
				sum+=vec.elementAt(i);
			}
			int max = Collections.max(vec);
			sum-=max;
			
			while(c<=256) {
				if((max^c) == sum) {
					ans = c;
					break;
				}
				c++;
			}
			System.out.println(ans);
		}
		
		sc.close();

	}

}
