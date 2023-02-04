package Contest6;

import java.util.*;

public class LostPermutation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int s = sc.nextInt();
			int sum=0;
			int flag=0;
			Vector<Integer> a = new Vector<Integer>();
			Vector<Integer> vec = new Vector<Integer>();
			
			for(int i=0;i<n;i++) {
				a.add(sc.nextInt());
			}
			
			Collections.sort(a);
			
			for(int i=0;i<a.size();i++) {
				int x = i+1;
				if(x!=a.elementAt(i)) {
					a.insertElementAt(i+1, i);
					vec.add(i+1);
					sum+=(i+1);
				}
			}
			
			if(sum==s) {
				flag=1;
			}
			else{
				for(int i=Collections.max(a)+1;;i++) {
					sum+=i;
					if(sum==s) {
						flag=1;
						break;
					}
					else if(sum>s) {
						flag=0;
						break;
					}
				}
			}
			
			
			if(flag==1) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

			t--;
		}

	}

}
