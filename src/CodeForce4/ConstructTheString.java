package CodeForce4;

import java.util.Scanner;

public class ConstructTheString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = 97;
			int count = 0;
			String s ="";
			String str = "";
			
			
			for(int i=1;i<=n;i++) {
				s = s.concat(String.valueOf((char)c));
				c++;
				count++;
				if(count==b) {
					c=97;
					count=0;
				}
			}
			
			System.out.println(s);
			
			
			t--;
		}

	}

}
