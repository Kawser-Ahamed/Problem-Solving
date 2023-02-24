package Codeforce7;

import java.util.*;

public class MaximumControl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		Vector<Integer> vec = new Vector<>();
		
		for(int i=1;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			else {
				map.put(a, 1);
			}
			if(map.containsKey(b)) {
				map.put(b, map.get(b)+1);
			}
			else {
				map.put(b, 1);
			}
		}
		
		vec.addAll(map.values());
		int c=0;
		for(int i=0;i<vec.size();i++) {
			if(vec.elementAt(i)==1) {
				c++;
			}
		}
		System.out.println(c);
		sc.close();
	}

}
