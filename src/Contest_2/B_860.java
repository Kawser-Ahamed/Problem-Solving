package Contest_2;

import java.util.*;

public class B_860 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int m = sc.nextInt();
			int index = 0;
			String str = "";
			String s = "";
			int size =m;
			int a[] = new int [size];
			int flag=0;
			
			while(m-->0) {			
				int n = sc.nextInt();
				a[index]=n;
				index++;
				
				for(int i=0;i<n;i++) {
					int x = sc.nextInt();
					str = str.concat(String.valueOf(x)+" ");
				}
			}
			int c=0;
			int start = 0;
			int end = a[c];
			end=end*2;
			for(int i=start;i<end;i+=2) {
				String x = str.substring(end, str.length());
				String p = String.valueOf(str.charAt(i));
				
				if(x.contains(p)) {
					flag=0;
					continue;
				}
				else {
					flag=1;
					s = s.concat(p+" ");
					c++;
					start = end;
					end = end+(a[c]*2);
				}
			}
			System.out.println(s);
		}	
		sc.close();
	}

}
