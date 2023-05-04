package Contest_8;

import java.util.*;

public class A_869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		while(test-->0) {
			
			int n = sc.nextInt();
			@SuppressWarnings("unused")
			int k = sc.nextInt();
			HashMap<String,Integer> map = new HashMap<>();
			String []a = new String[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.next();
				if(map.containsKey(a[i])) {
					map.put(a[i], map.get(a[i])+1);
				}
				else {
					map.put(a[i], 1);
				}	
			}
			System.out.println(map.get(a[0]));
		}
		
		sc.close();

	}

}
