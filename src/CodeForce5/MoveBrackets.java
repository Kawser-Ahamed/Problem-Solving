package CodeForce5;

import java.util.*;

public class MoveBrackets {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0){
			
			int n = sc.nextInt();
			String str = sc.next();
			int c = 0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='(') {
					c++;
				}
				else {
					if(c>0) {
						c--;
					}
				}
			}
			
			System.out.println(c);
			
			t--;
		}
	}

}
