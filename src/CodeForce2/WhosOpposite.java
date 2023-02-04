package CodeForce2;

import java.util.Scanner;

public class WhosOpposite {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int d = Math.abs(a-b);
			
			if(a>d*2 || b>d*2 || c>d*2) {
				System.out.println(-1);
			}
			else {
				if(c>d) {
					System.out.println(c-d);
				}
				else {
					System.out.println(c+d);
				}
					
			}
			
			t--;
		}

	}

}
