package CodeForce5;

import java.util.*;

public class Lecture {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Vector<String> str = new Vector<String>();
		Vector<String> str2 = new Vector<String>();
		Vector<String> str3 = new Vector<String>();
		
		for(int i=0;i<m;i++) {
			str.add(sc.next());
			str2.add(sc.next());
		}
		
		for(int i=0;i<n;i++) {
			str3.add(sc.next());
			
			String x = str3.elementAt(i);
			int l = x.length();
			int index = str.indexOf(x);
			String s = str2.elementAt(index);
			int l2 = s.length();
			
			if(l<=l2) {
				System.out.print(str3.elementAt(i)+" ");
			}
			else {
				System.out.print(str2.elementAt(index)+" ");
			}
		}
		
		

	}

}
