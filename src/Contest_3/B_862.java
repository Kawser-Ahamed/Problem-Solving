package Contest_3;

import java.util.*;

public class B_862 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			StringBuffer bf = new StringBuffer(str);
			char charcter = 'z';
			int pos = 0;
			
			for(int j=1;j<n;j++) {
				if(str.charAt(0)>=str.charAt(j) && str.charAt(j)<=charcter) {
					charcter=str.charAt(j);
					pos = j;
				}
			}
			if(pos==0) {
				System.out.println(str);
			}
			else {
				bf.deleteCharAt(pos);
				System.out.println(charcter+""+bf);
			}
			t--;
		}
		
		sc.close();

	}

}
