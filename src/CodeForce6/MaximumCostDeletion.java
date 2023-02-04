package CodeForce6;

import java.util.*;

public class MaximumCostDeletion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			String str = sc.next();
			Vector<Integer> vec = new Vector<Integer>();
			Vector<Integer> vec2 = new Vector<Integer>();
			
			int c =0;
			int d =0;
			int o =0;
			int z =0;
			int total=0;
			
			
			if(b>=0) {
				System.out.println((a+b)*n);
			}
			else {
				for(int i=0;i<str.length();i++) {
					if(str.charAt(i)=='1') {
						o++;
						c++;
					}
					else {
						if(c>0) {
							vec.add(c);
							c=0;
						}	
					}
					if(str.charAt(i)=='0') {
						z++;
						d++;
					}
					else {
						if(d>0) {
							vec2.add(d);
							d=0;
						}
					}
				}
				
				if(c>0) {
					vec.add(c);
				}
				if(d>0) {
					vec2.add(d);
				}
				
				if(o>=z) {
					for(int i=0;i<vec2.size();i++) {
						total+=(a*vec2.elementAt(i))+b;
					}
					total+=(a*o)+b;
					System.out.println(total);
				}
				else {
					for(int i=0;i<vec.size();i++) {
						total+=(a*vec.elementAt(i))+b;
					}
					total+=(a*z)+b;
					System.out.println(total);
				}
				
			}
			
			t--;
		}

	}

}
