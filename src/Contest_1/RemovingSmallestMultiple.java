package Contest_1;

import java.util.*;

public class RemovingSmallestMultiple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			String str = sc.next();
			Vector vec = new Vector();
			int total = 0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='0') {
					int index = i+1;
					vec.add(index);
				}
			}
			
			
			
			
			
			t--;
		}

	}

}
