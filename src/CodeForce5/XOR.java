package CodeForce5;

import java.util.Scanner;

public class XOR {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			
			if(n==1) {
				System.out.println(1);
			}
			else if(n==2) {
				System.out.println(3+" "+1);
			}
			else {
				if(n%2==0) {
					for(int i=1;i<=n-2;i++) {
						System.out.print(2+" ");
					}
					System.out.println(3+" "+1);
				}
				else {
					for(int i=1;i<=n;i++) {
						System.out.print(n+" ");
					}
					System.out.println();
				}
			}
			
			t--;
		}
	}

}
