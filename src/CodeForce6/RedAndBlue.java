package CodeForce6;

import java.util.*;

public class RedAndBlue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			Vector<Integer> vec = new Vector<Integer>();
			Vector<Integer> vec2 = new Vector<Integer>();
			Vector<Integer> vec3 = new Vector<Integer>();
			Vector<Integer> vec4 = new Vector<Integer>();
			int sum = 0;
			
			
			for(int i=0;i<n;i++) {
				vec.add(sc.nextInt());
			}
			int m = sc.nextInt();
			for(int i=0;i<m;i++) {
				vec2.add(sc.nextInt());
			}
			
			int max = 0;
			for(int i=0;i<n;i++) {
				sum+=vec.elementAt(i);
				if(sum>max) {
					max = sum;
				}
				else {
					vec3.add(max);
					max = sum;
				}
			}
			vec3.add(max);
			sum = 0;
			max = 0;
			for(int i=0;i<m;i++) {
				sum+=vec2.elementAt(i);
				if(sum>max) {
					max = sum;
				}
				else {
					vec4.add(max);
					max = sum;
				}
			}
			vec4.add(max);
			System.out.println(Collections.max(vec3)+Collections.max(vec4));
			
			t--;
		}

	}

}
