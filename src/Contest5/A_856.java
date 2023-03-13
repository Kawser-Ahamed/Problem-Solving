package Contest5;

import java.util.*;

public class A_856 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int x = n/2 + n%2;
			String s[] = new String [(2*n)-2];
			Vector<String> vec = new Vector<>();
			Vector<String> vec2 = new Vector<>();
			
			for(int i=0;i<s.length;i++) {
				s[i]=sc.next();
			}
			
			for(int i=0;i<s.length;i++) {
				if(s[i].length()==1) {
					vec.add(s[i]);
				}
				else if(s[i].length()==x) {
					vec2.add(s[i]);
				}
			}
			
			if(n==2) {
				System.out.println("YES");
			}
			else {
				String s1 = vec2.elementAt(0);
				String s2 = vec2.elementAt(1);
				String pref = "";
				String suf = "";
				
				if(vec.elementAt(0).equals(String.valueOf(s1.charAt(0)))) {
					pref = s1;
					suf = s2;
				}
				else if(vec.elementAt(1).equals(String.valueOf(s1.charAt(0)))){
					pref = s1;
					suf = s2;
				}
				else {
					pref = s2;
					suf = s1;
				}
				
				String str = pref+suf;
				String str2 ="";
				StringBuffer buffer = new StringBuffer(str);
				buffer=buffer.reverse();
				str2=buffer.toString();
				
				if(str.equals(str2)) {
					System.out.println("YES");
				}
				else {
					System.out.println("NO");
				}
			}
			
			
			t--;
		}
		
		sc.close();
	}

}
