package Codeforce8;

import java.util.Scanner;

public class FrogJumps {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-->0) {
			
			String str = sc.next();
			str = str.concat("R");
			int max = 0,index=-1;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='R') {
					int ans = i-index;
					index=i;
					if(ans>max) {
						max=ans;
					}
				}
			}
			
			System.out.println(max);	
		}
		
		sc.close();

	}

}
