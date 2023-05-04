package Contest_4;

import java.util.*;

public class B_863 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int n = sc.nextInt();
			Long x1 = sc.nextLong();
			Long y1 = sc.nextLong();
			Long x2 = sc.nextLong();
			Long y2 = sc.nextLong();
			Vector<Long> vec = new Vector<>();
			
			int f = n/2;
			int s = f+1;
			
			
			if(x1<=f) {
				vec.add((f-x1)+1);
			}
			else {
				vec.add((x1-s)+1);
			}
			if(y1<=f) {
				vec.add((f-y1)+1);
			}
			else {
				vec.add((y1-s)+1);
			}
			if(x2<=f) {
				vec.add((f-x2)+1);
			}
			else {
				vec.add((x2-s)+1);
			}
			if(y2<=f) {
				vec.add((f-y2)+1);
			}
			else {
				vec.add((y2-s)+1);
			}
			Long max1 = Math.max(vec.elementAt(0), vec.elementAt(1));
			Long max2 = Math.max(vec.elementAt(2), vec.elementAt(3));
			
			System.out.println(Math.abs(max1-max2));
			
		}

	}

}
