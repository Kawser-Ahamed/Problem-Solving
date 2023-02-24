import java.util.*;
import java.util.Map.Entry;

public class Round143B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int flag=0;
			HashMap <Integer,Integer> map = new HashMap<>();
			for(int i=1;i<=n;i++) {
				int l = sc.nextInt();
				int r = sc.nextInt();
				
				if(l==k && r==k) {
					flag=1;
					continue;
				}
				if(l<=k && k<=r) {
					for(int j=l;j<=k;j++) {
						if(map.containsKey(j)) {
							map.put(j, map.get(j)+1);
						}
						else {
							map.put(j,1);
						}
						
					}
				}
			}
			int max = 0;
			if(map.containsKey(k)) {
				max = map.get(k);
			}
			int c =0;
			
			for(Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getValue()==max) {
					c++;
				}
			}
			
			if(flag==1 || c==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			
			t--;
		}

	}

}
