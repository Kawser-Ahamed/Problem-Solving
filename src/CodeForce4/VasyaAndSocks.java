package CodeForce4;

import java.util.Scanner;

public class VasyaAndSocks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i=m;
		
		while(n>=m) {
			m+=i;
			n++;
		}
		
		System.out.println(n);
	}

}
