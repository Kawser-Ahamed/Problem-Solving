package CodeForce4;

import java.util.*;

public class HQ9Plus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int flag=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='H'||s.charAt(i)=='Q'||s.charAt(i)=='9') {
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		if(flag==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}
