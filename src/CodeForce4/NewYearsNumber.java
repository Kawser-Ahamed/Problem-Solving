package CodeForce4;

import java.util.Scanner;

public class NewYearsNumber {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int d = n/2020;
			
			if((2020*d)<=n && n<=(2021*d)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}

	}

}
