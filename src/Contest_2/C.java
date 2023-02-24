package Contest_2;

import java.util.*;

public class C {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			String str = sc.next();
			//StringBuffer buffer = new StringBuffer(str);
			int c =0;
			int x = n/2;
			int j = n-1;
			
			for(int i=0;i<x;i++) {
				if((str.charAt(i)=='1' && str.charAt(j)=='0')|| (str.charAt(i)=='0' && str.charAt(j)=='1')) {
					c+=2;
					j--;
				}
				else {
					break;
				}
			}
			System.out.println(n-c);
			t--;
		}

	}

}
