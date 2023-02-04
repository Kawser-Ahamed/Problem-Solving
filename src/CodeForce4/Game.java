package CodeForce4;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			String str = sc.next();
			int c1 = 0;
			int c2 = 0;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='0') {
					c1++;
				}
				else {
					c2++;
				}
			}
			
			int min = Math.min(c1, c2);
			min*=2;
			
			if(min%4==0) {
				System.out.println("NET");
			}
			else {
				System.out.println("DA");
			}
			
			
			
			t--;
		}

	}

}
