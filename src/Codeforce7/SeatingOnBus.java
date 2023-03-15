package Codeforce7;

import java.util.*;

public class SeatingOnBus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = m-n*2;
		int d = (n*2)+1;
		int a = 0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=1;i<=n*2;i++) {
			if(x>0) {
				map.put(i, d);
				d++;
				x--;
			}
			else {
				map.put(i, -1);
			}
		}
		
		for(Map.Entry<Integer, Integer> set : map.entrySet()) {
			if(a==m) {
				break;
			}
			if(set.getValue()!=-1) {
				System.out.print(set.getValue()+" ");
				a++;
			}
			if(a==m) {
				break;
			}
			System.out.print(set.getKey()+" ");
			a++;
			
		}
		sc.close();

	}

}
