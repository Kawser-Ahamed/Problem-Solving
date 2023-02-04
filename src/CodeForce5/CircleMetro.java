package CodeForce5;

import java.util.Scanner;

public class CircleMetro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int x = sc.nextInt();
		int b = sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			a++;
			b--;
			if(a>n) {
				a=1;
			}
			if(b<1) {
				b=n;
			}
			if(a==b) {
				System.out.println("YES");
				break;
			}
			else if(a==x || b==y){
				System.out.println("NO");
				break;
			}
		}
		
	}

}
