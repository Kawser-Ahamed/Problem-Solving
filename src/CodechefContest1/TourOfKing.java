package CodechefContest1;

import java.util.Scanner;

public class TourOfKing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println((n*5)+(m*7));
			
			t--;
		}

	}

}
