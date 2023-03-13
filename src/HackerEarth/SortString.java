package HackerEarth;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			String str =sc.next();
			int c1=0,c2=0,c3=0;
			for(int i=0;i<n;i++) {
				if(str.charAt(i)=='1') {
					c1++;
				}
				else if(str.charAt(i)=='0' && c1>0){
					c3++;
				}
			}
			for(int i=str.length()-1;i>=0;i--) {
				if(str.charAt(i)=='0') {
					break;
				}
				else {
					c2++;
				}
			}
			c1-=c2;
			System.out.println(Math.min(((c1/2)+(c1%2)), ((c3/2)+(c3%2))));
			t--;
		}
		sc.close();
	}

}
