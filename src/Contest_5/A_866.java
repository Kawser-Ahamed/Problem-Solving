package Contest_5;

import java.util.*;

public class A_866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			String str = sc.next();
			str = '#'+str;
			int count=0,flag=0;
			
			for(int i=1;i<str.length();i++) {
				if(str.charAt(i)=='_') {
					if(str.charAt(i-1)!='^') {
						count++;
					}
				}
			}
		}
		
		sc.close();

	}

}
