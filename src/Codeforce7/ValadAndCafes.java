package Codeforce7;

import java.util.*;
import java.util.Map.Entry;

public class ValadAndCafes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Long n = sc.nextLong();
		Long a;
		HashMap<Long,Long> map = new HashMap<Long,Long>();
		
		for(Long i=1L;i<=n;i++) {
			a=sc.nextLong();
			map.put(a, i);
		}
		Long min = Collections.min(map.values());
		for(Entry<Long, Long> entry : map.entrySet()) {
			if(entry.getValue()==min) {
				System.out.println(entry.getKey());
				break;
			}
		}
		sc.close();

	}

}
