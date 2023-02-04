package CodeForce4;

import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			int n = sc.nextInt();
			int x = 3;
			boolean check = false;
			
			while(check==false) {
				if(n%x==0) {
					System.out.println(n/x);
					check = true;
					break;
				}
				else {
					x = (x*2)+1;
				}
			}
			t--;
		}

	}

}
