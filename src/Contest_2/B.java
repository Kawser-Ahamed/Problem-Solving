package Contest_2;

import java.util.*;

public class B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			String str = sc.next();
			int pos1 =0;
			int pos2 =0;
			int flag=0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='U') {
					pos1++;
				}
				else if(str.charAt(i)=='D') {
					pos1--;
				}
				else if(str.charAt(i)=='R') {
					pos2++;
				}
				else if(str.charAt(i)=='L') {
					pos2--;
				}
				
				if(pos1 ==1 && pos2==1) {
					flag=1;
					break;
				}
			}
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}

	}

}
