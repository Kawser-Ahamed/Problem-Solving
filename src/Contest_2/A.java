package Contest_2;

import java.util.*;

public class A {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			String str = sc.next();
			if(str.equals("c") ||str.equals("o") || str.equals("d") ||str.equals("e") ||str.equals("f") ||str.equals("r")|| str.equals("s")) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}

	}

}
