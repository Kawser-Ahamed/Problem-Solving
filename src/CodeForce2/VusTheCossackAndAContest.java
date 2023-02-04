package CodeForce2;

import java.util.Scanner;

public class VusTheCossackAndAContest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		if(m<n || k<n) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}

	}

}
