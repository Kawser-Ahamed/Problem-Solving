package Codeforce7;

import java.util.*;

public class CanvasFrames {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a;
		int sum=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		Vector<Integer> vec = new Vector<>();
		
		for(int i=1;i<=n;i++) {
			a = sc.nextInt();
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			else {
				map.put(a,1);
			}
		}
		
		vec.addAll(map.values());
		
		for(int i=0;i<vec.size();i++) {
			int x = vec.elementAt(i);
			if(x%2==1) {
				x--;
			}
			sum+=x;
		}
		System.out.println(sum/4);
		sc.close();
		
		
		

	}

}
