package Codeforce7;

import java.util.*;
import java.util.Map.Entry;

public class B_858 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int v = -1,max = -1,min = Integer.MAX_VALUE;
			HashMap<Integer,Integer> map = new HashMap<>();
			
			for(int i=0;i<n;i++) {
				int a = sc.nextInt();
				
				if(a>max) {
					max = a;
				}
				if(a<min) {
					min = a;
				}
				
				if(map.containsKey(a)) {
					map.put(a,map.get(a)+1);
				}
				else {
					map.put(a, 1);
				}
			}	
			
			for(Entry<Integer, Integer> entry : map.entrySet()) {
				int x = entry.getValue();
				int d = n-x;
				if(d>=(x-1)) {
					v = entry.getKey();
					break;
				}
			}
			
			if(v!=-1) {
				int temp = min-1;
				if(temp<v && temp>=0) {
					System.out.println(temp);
				}
				else {
					System.out.println(v);
				}
			}
			else {
				min--;
				if(min>=0) {
					System.out.println(min);
				}
				else {
					System.out.println(max+1);
				}
			}
			
			t--;
		}
		sc.close();

	}

}
