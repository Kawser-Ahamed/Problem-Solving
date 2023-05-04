package Contest6;

import java.util.*;

public class C {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			int flag=0;
			
			for(int i=0;i<n;i++) {
				if(str.charAt(i)=='0' || str.charAt(i)=='1') {
					continue;
				}
				for(int j=i;j<n;j++) {
					if(str.charAt(i)==str.charAt(j)) {
						if(i%2==0) {
							str=str.replace(str.charAt(i), '0');
						}
						else {
							str =str.replace(str.charAt(i), '1');
						}
					}
				}
			}
			
			for(int i=0;i<n-1;i++) {
				if(str.charAt(i)==str.charAt(i+1)) {
					flag=1;
					break;
				}
			}
			
			if(flag==1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}	
			t--;
		}
		
		sc.close();

	}

}
