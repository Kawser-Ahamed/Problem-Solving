package Contest_2;

import java.util.*;

public class A_860 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			Vector <Integer>a = new Vector<>();
			Vector <Integer>b = new Vector<>();
			int flag=1,flag2=1;
			
			for(int i=0;i<n;i++) {
				a.add(sc.nextInt());
			}
			for(int i=0;i<n;i++) {
				b.add(sc.nextInt());
			}
			
			for(int i=0;i<n;i++) {
				int el1 = (int) a.elementAt(i);
				int el2 = (int) b.elementAt(i);

				a.removeElementAt(i);
				b.removeElementAt(i);
				a.insertElementAt(Math.min(el1, el2), i);
				b.insertElementAt(Math.max(el1, el2), i);
			}
			
			if(Collections.max(a)==a.elementAt(n-1)) {
				flag=0;
			}
			if(Collections.max(b)==b.elementAt(n-1)) {
				flag2=0;
			}
			
			if(flag==0 && flag2==0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
		sc.close();

	}

}
