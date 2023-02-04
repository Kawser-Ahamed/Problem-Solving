package CodeForce5;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			String str = sc.next();
			String s = str;
			StringBuffer buffer = new StringBuffer(s);
			buffer.reverse();
			s=String.valueOf(buffer);
			System.out.println(str+s);

			t--;
		}

	}

}
