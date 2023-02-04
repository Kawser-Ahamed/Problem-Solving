package CodechefContest2;

import java.util.*;

public class D {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			int o =0;
			int z = 0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='0') {
					z++;
				}
				else {
					o++;
				}
			}
			
			if(z<o) {
				System.out.println(1+z);
			}
			else if(z>o) {
				System.out.println(o);
			}
			else{
				
				System.out.println(z);
			}
			
			t--;
		}

	}

}
