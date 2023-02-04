package CodeForce5;

import java.util.Scanner;

public class Buttons {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n-1;
		int x = 0;
		
		for(int i =1;i<=n-1;i++) {
			x+=i*m;
			m--;
		}
		
		x+=n;
		
		System.out.println(x);		

	}

}
