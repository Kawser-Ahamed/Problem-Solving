package Contest_2;

import java.util.*;

public class D {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			Vector<Integer> vec = new Vector<Integer>();
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			int c = 0;

			for(int i=0;i<str.length();i++) {
				if(map.containsKey(String.valueOf(str.charAt(i)))) {
					vec.add(c);
					c=1;
					map.clear();
					map.put(String.valueOf(str.charAt(i)), c);
				}
				else {
					c++;
					map.put(String.valueOf(str.charAt(i)), c);
				}
			}
			vec.add(c);
			vec.add(0);
			Collections.sort(vec); 
			
			System.out.println(Collections.max(vec)+vec.elementAt(vec.size()-2));
			
			t--;
		}

	}

}
