package CodeForce2;

import java.util.Scanner;

public class Pedestal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			
			int n = sc.nextInt();
			int a,b,c;
			if(n%3==0) {
				
				int div = n/3;
				a = div+1;
				b = a-1;
				c = n-(a+b);
				if(b==c) {
					b+=1;
					c-=1;
				}
			}
			else {
				
				int div = n/3;
				a = div+2;
				b = a-2;
				c = n-(a+b);
				if(b==c) {
					b+=1;
					c-=1;
				}
			}
			
			System.out.println(b+" "+a+" "+c);

			t--;
		}

	}

}
