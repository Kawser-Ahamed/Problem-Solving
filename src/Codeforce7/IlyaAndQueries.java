package Codeforce7;

import java.util.*;

public class IlyaAndQueries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int m = sc.nextInt();
		int c = 0;
		Vector<Integer> vec = new Vector<>();
		vec.add(0);
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				c++;
			}
			vec.add(c);
		}
		while(m-->0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(vec.elementAt(r-1)-vec.elementAt((l-1)));
		}
		sc.close();

	}

}
