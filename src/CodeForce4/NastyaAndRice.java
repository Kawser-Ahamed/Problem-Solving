package CodeForce4;

import java.util.Scanner;

public class NastyaAndRice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			if( ((a+b)*n) >= c-d && (a-b)*n <= c+d) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
			t--;
		}

	}

}
