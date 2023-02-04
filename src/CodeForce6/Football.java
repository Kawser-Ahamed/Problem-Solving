package CodeForce6;

import java.util.*;
import java.util.Map.Entry;

public class Football {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		String str = "";
		
		for(int i=0;i<n;i++) {
			str = sc.next();
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		
		int max = Collections.max(map.values());
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
		sc.close();

	}

}
