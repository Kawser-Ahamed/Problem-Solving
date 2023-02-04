package CodeForce6;

import java.util.Scanner;

public class TaisiaandDice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int s = sc.nextInt();
			int r = sc.nextInt();
			
			System.out.print(s-r+" ");
			
			int x = r/(n-1);
			int c = r%(n-1);
			
			for(int i=1;i<=n-1;i++) {
				if(c>0) {
					System.out.print(x+1+" ");
					c--;
				}
				else {
					System.out.print(x+" ");
				}
			}
			System.out.println();
			t--;
		}

	}

}
